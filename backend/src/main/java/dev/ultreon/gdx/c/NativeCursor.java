/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package dev.ultreon.gdx.c;

import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import dev.ultreon.gdx.c.glfw.GLFW;

import java.util.HashMap;
import java.util.Map;

public class NativeCursor implements Cursor {
    static final Array<NativeCursor> cursors = new Array<NativeCursor>();
    static final Map<SystemCursor, Long> systemCursors = new HashMap<SystemCursor, Long>();

    private static int inputModeBeforeNoneCursor = -1;

    final NativeWindow window;
    Pixmap pixmapCopy;
    GLFWImage glfwImage;
    final long glfwCursor;

    NativeCursor(NativeWindow window, Pixmap pixmap, int xHotspot, int yHotspot) {
        this.window = window;
        if (pixmap.getFormat() != Pixmap.Format.RGBA8888) {
            throw new GdxRuntimeException("Cursor image pixmap is not in RGBA8888 format.");
        }

        if ((pixmap.getWidth() & (pixmap.getWidth() - 1)) != 0) {
            throw new GdxRuntimeException(
                    "Cursor image pixmap width of " + pixmap.getWidth() + " is not a power-of-two greater than zero.");
        }

        if ((pixmap.getHeight() & (pixmap.getHeight() - 1)) != 0) {
            throw new GdxRuntimeException(
                    "Cursor image pixmap height of " + pixmap.getHeight() + " is not a power-of-two greater than zero.");
        }

        if (xHotspot < 0 || xHotspot >= pixmap.getWidth()) {
            throw new GdxRuntimeException(
                    "xHotspot coordinate of " + xHotspot + " is not within image width bounds: [0, " + pixmap.getWidth() + ").");
        }

        if (yHotspot < 0 || yHotspot >= pixmap.getHeight()) {
            throw new GdxRuntimeException(
                    "yHotspot coordinate of " + yHotspot + " is not within image height bounds: [0, " + pixmap.getHeight() + ").");
        }

        this.pixmapCopy = new Pixmap(pixmap.getWidth(), pixmap.getHeight(), Pixmap.Format.RGBA8888);
        this.pixmapCopy.setBlending(Blending.None);
        this.pixmapCopy.drawPixmap(pixmap, 0, 0);

        glfwImage = GLFWImage.malloc();
        glfwImage.width = pixmapCopy.getWidth();
        glfwImage.height = pixmapCopy.getHeight();
        glfwImage.pixels = pixmapCopy.getPixels().array();
        glfwCursor = GLFW.createCursor(glfwImage, xHotspot, yHotspot);
        cursors.add(this);
    }

    @Override
    public void dispose() {
        if (pixmapCopy == null) {
            throw new GdxRuntimeException("Cursor already disposed");
        }
        cursors.removeValue(this, true);
        pixmapCopy.dispose();
        pixmapCopy = null;
        glfwImage.free();
        GLFW.destroyCursor(glfwCursor);
    }

    static void dispose(NativeWindow window) {
        for (int i = cursors.size - 1; i >= 0; i--) {
            NativeCursor cursor = cursors.get(i);
            if (cursor.window.equals(window)) {
                cursors.removeIndex(i).dispose();
            }
        }
    }

    static void disposeSystemCursors() {
        for (long systemCursor : systemCursors.values()) {
            GLFW.destroyCursor(systemCursor);
        }
        systemCursors.clear();
    }

    static void setSystemCursor(long windowHandle, SystemCursor systemCursor) {
        if (systemCursor == SystemCursor.None) {
            if (inputModeBeforeNoneCursor == -1)
                inputModeBeforeNoneCursor = GLFW.getInputMode(windowHandle, GLFW.GLFW_CURSOR);
            GLFW.setInputMode(windowHandle, GLFW.GLFW_CURSOR, GLFW.GLFW_CURSOR_HIDDEN);
            return;
        } else if (inputModeBeforeNoneCursor != -1) {
            GLFW.setInputMode(windowHandle, GLFW.GLFW_CURSOR, inputModeBeforeNoneCursor);
            inputModeBeforeNoneCursor = -1;
        }
        Long glfwCursor = systemCursors.get(systemCursor);
        if (glfwCursor == null) {
            long handle;
            if (systemCursor == SystemCursor.Arrow) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_ARROW_CURSOR);
            } else if (systemCursor == SystemCursor.Crosshair) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_CROSSHAIR_CURSOR);
            } else if (systemCursor == SystemCursor.Hand) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_HAND_CURSOR);
            } else if (systemCursor == SystemCursor.HorizontalResize) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_HRESIZE_CURSOR);
            } else if (systemCursor == SystemCursor.VerticalResize) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_VRESIZE_CURSOR);
            } else if (systemCursor == SystemCursor.Ibeam) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_IBEAM_CURSOR);
            } else if (systemCursor == SystemCursor.NWSEResize) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_RESIZE_NWSE_CURSOR);
            } else if (systemCursor == SystemCursor.NESWResize) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_RESIZE_NESW_CURSOR);
            } else if (systemCursor == SystemCursor.AllResize) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_RESIZE_ALL_CURSOR);
            } else if (systemCursor == SystemCursor.NotAllowed) {
                handle = GLFW.createStandardCursor(GLFW.GLFW_NOT_ALLOWED_CURSOR);
            } else {
                throw new GdxRuntimeException("Unknown system cursor " + systemCursor);
            }

            if (handle == 0) {
                return;
            }
            glfwCursor = handle;
            systemCursors.put(systemCursor, glfwCursor);
        }
        GLFW.setCursor(windowHandle, glfwCursor);
    }
}
