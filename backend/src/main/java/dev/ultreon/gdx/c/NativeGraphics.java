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

import com.badlogic.gdx.AbstractGraphics;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.Cursor.SystemCursor;
import com.badlogic.gdx.graphics.glutils.GLVersion;
import com.badlogic.gdx.graphics.glutils.HdpiMode;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import dev.ultreon.gdx.c.glfw.GLFW;
import dev.ultreon.gdx.c.opengl.OpenGL;
import org.teavm.interop.Address;
import org.teavm.interop.Function;

import static dev.ultreon.gdx.c.glfw.GLFW.*;

public class NativeGraphics extends AbstractGraphics implements Disposable {
    final NativeWindow window;
    GL20 gl20;
    private GL30 gl30;
    private GL31 gl31;
    private GL32 gl32;
    private GLVersion glVersion;
    private volatile int backBufferWidth;
    private volatile int backBufferHeight;
    private volatile int logicalWidth;
    private volatile int logicalHeight;
    private volatile boolean isContinuous = true;
    private BufferFormat bufferFormat;
    private long lastFrameTime = -1;
    private float deltaTime;
    private boolean resetDeltaTime = false;
    private long frameId;
    private long frameCounterStart = 0;
    private int frames;
    private int fps;
    private int windowPosXBeforeFullscreen;
    private int windowPosYBeforeFullscreen;
    private int windowWidthBeforeFullscreen;
    private int windowHeightBeforeFullscreen;
    private DisplayMode displayModeBeforeFullscreen = null;

    int[] tmpBuffer = new int[1];
    int[] tmpBuffer2 = new int[1];

    GLFWFramebufferSizeCallback resizeCallback = Function.get(GLFWFramebufferSizeCallback.class, NativeGraphics.class, "resizeCallback");

    public static void resizeCallback(Address windowHandle, int width, int height) {
        NativeWindow window = NativeWindow.byAddress(windowHandle);
        NativeGraphics graphics = window.getGraphics();
//        if (!"glfw_async".equals(Configuration.GLFW_LIBRARY_NAME.get())) {
        graphics.updateFramebufferInfo();
        if (!window.isListenerInitialized()) {
            return;
        }
        window.makeCurrent();
        graphics.gl20.glViewport(0, 0, graphics.backBufferWidth, graphics.backBufferHeight);
        window.getListener().resize(graphics.getWidth(), graphics.getHeight());
        graphics.update();
        window.getListener().render();
        swapBuffers(windowHandle.toLong());
//        } else {
//            window.asyncResized = true;
//        }
    }

    public NativeGraphics(NativeWindow window) {
        this.window = window;
        if (window.getConfig().glEmulation == NativeApplicationConfiguration.GLEmulation.GL32) {
            this.gl20 = this.gl30 = this.gl31 = this.gl32 = new NativeGL32();
        } else if (window.getConfig().glEmulation == NativeApplicationConfiguration.GLEmulation.GL31) {
            this.gl20 = this.gl30 = this.gl31 = new NativeGL32();
        } else if (window.getConfig().glEmulation == NativeApplicationConfiguration.GLEmulation.GL30) {
            this.gl20 = this.gl30 = new NativeGL32();
        } else {
            try {
                if (window.getConfig().glEmulation == NativeApplicationConfiguration.GLEmulation.GL20) {
                    this.gl20 = new NativeGL32();
                } else {
                    throw new GdxRuntimeException("Unknown GLES version: " + window.getConfig().glEmulation);
                }
            } catch (Throwable t) {
                throw new GdxRuntimeException("Couldn't instantiate GLES20.", t);
            }
            this.gl30 = null;
        }
        updateFramebufferInfo();
        initiateGL();
        setFramebufferSizeCallback(window.getWindowHandle(), resizeCallback);
    }

    private void initiateGL() {
        String versionString = gl20.glGetString(OpenGL.GL_VERSION);
        String vendorString = gl20.glGetString(OpenGL.GL_VENDOR);
        String rendererString = gl20.glGetString(OpenGL.GL_RENDERER);
        glVersion = new GLVersion(Application.ApplicationType.Desktop, versionString, vendorString, rendererString);
        if (supportsCubeMapSeamless()) {
            enableCubeMapSeamless(true);
        }
    }

    /**
     * @return whether cubemap seamless feature is supported.
     */
    public boolean supportsCubeMapSeamless() {
        return glVersion.isVersionEqualToOrHigher(3, 2) || supportsExtension("GL_ARB_seamless_cube_map");
    }

    /**
     * Enable or disable cubemap seamless feature. Default is true if supported. Should only be called if this feature is
     * supported. (see {@link #supportsCubeMapSeamless()})
     *
     * @param enable
     */
    public void enableCubeMapSeamless(boolean enable) {
        if (enable) {
            gl20.glEnable(OpenGL.GL_TEXTURE_CUBE_MAP_SEAMLESS);
        } else {
            gl20.glDisable(OpenGL.GL_TEXTURE_CUBE_MAP_SEAMLESS);
        }
    }

    public NativeWindow getWindow() {
        return window;
    }

    void updateFramebufferInfo() {
        getFramebufferSize(window.getWindowHandle(), tmpBuffer, tmpBuffer2);
        this.backBufferWidth = tmpBuffer[0];
        this.backBufferHeight = tmpBuffer2[0];
        getWindowSize(window.getWindowHandle(), tmpBuffer, tmpBuffer2);
        NativeGraphics.this.logicalWidth = tmpBuffer[0];
        NativeGraphics.this.logicalHeight = tmpBuffer2[0];
        NativeApplicationConfiguration config = window.getConfig();
        bufferFormat = new BufferFormat(config.r, config.g, config.b, config.a, config.depth, config.stencil, config.samples,
                false);
    }

    void update() {
        long time = System.nanoTime();
        if (lastFrameTime == -1) lastFrameTime = time;
        if (resetDeltaTime) {
            resetDeltaTime = false;
            deltaTime = 0;
        } else
            deltaTime = (time - lastFrameTime) / 1000000000.0f;
        lastFrameTime = time;

        if (time - frameCounterStart >= 1000000000) {
            fps = frames;
            frames = 0;
            frameCounterStart = time;
        }
        frames++;
        frameId++;
    }

    @Override
    public boolean isGL30Available() {
        return gl30 != null;
    }

    @Override
    public boolean isGL31Available() {
        return gl31 != null;
    }

    @Override
    public boolean isGL32Available() {
        return gl32 != null;
    }

    @Override
    public GL20 getGL20() {
        return gl20;
    }

    @Override
    public GL30 getGL30() {
        return gl30;
    }

    @Override
    public GL31 getGL31() {
        return gl31;
    }

    @Override
    public GL32 getGL32() {
        return gl32;
    }

    @Override
    public void setGL20(GL20 gl20) {
        this.gl20 = gl20;
    }

    @Override
    public void setGL30(GL30 gl30) {
        this.gl30 = gl30;
    }

    @Override
    public void setGL31(GL31 gl31) {
        this.gl31 = gl31;
    }

    @Override
    public void setGL32(GL32 gl32) {
        this.gl32 = gl32;
    }

    @Override
    public int getWidth() {
        if (window.getConfig().hdpiMode == HdpiMode.Pixels) {
            return backBufferWidth;
        } else {
            return logicalWidth;
        }
    }

    @Override
    public int getHeight() {
        if (window.getConfig().hdpiMode == HdpiMode.Pixels) {
            return backBufferHeight;
        } else {
            return logicalHeight;
        }
    }

    @Override
    public int getBackBufferWidth() {
        return backBufferWidth;
    }

    @Override
    public int getBackBufferHeight() {
        return backBufferHeight;
    }

    public int getLogicalWidth() {
        return logicalWidth;
    }

    public int getLogicalHeight() {
        return logicalHeight;
    }

    @Override
    public long getFrameId() {
        return frameId;
    }

    @Override
    public float getDeltaTime() {
        return deltaTime;
    }

    public void resetDeltaTime() {
        resetDeltaTime = true;
    }

    @Override
    public int getFramesPerSecond() {
        return fps;
    }

    @Override
    public GraphicsType getType() {
        return GraphicsType.LWJGL3;
    }

    @Override
    public GLVersion getGLVersion() {
        return glVersion;
    }

    @Override
    public float getPpiX() {
        return getPpcX() * 2.54f;
    }

    @Override
    public float getPpiY() {
        return getPpcY() * 2.54f;
    }

    @Override
    public float getPpcX() {
        NativeMonitor monitor = (NativeMonitor) getMonitor();
        getMonitorPhysicalSize(monitor.monitorHandle, tmpBuffer, tmpBuffer2);
        int sizeX = tmpBuffer[0];
        DisplayMode mode = getDisplayMode();
        return mode.width / (float) sizeX * 10;
    }

    @Override
    public float getPpcY() {
        NativeMonitor monitor = (NativeMonitor) getMonitor();
        getMonitorPhysicalSize(monitor.monitorHandle, tmpBuffer, tmpBuffer2);
        int sizeY = tmpBuffer2[0];
        DisplayMode mode = getDisplayMode();
        return mode.height / (float) sizeY * 10;
    }

    @Override
    public boolean supportsDisplayModeChange() {
        return true;
    }

    @Override
    public Monitor getPrimaryMonitor() {
        return NativeApplicationConfiguration.toNativeMonitor(GLFW.getPrimaryMonitor());
    }

    @Override
    public Monitor getMonitor() {
        Monitor[] monitors = getMonitors();
        Monitor result = monitors[0];

        GLFW.getWindowPos(window.getWindowHandle(), tmpBuffer, tmpBuffer2);
        int windowX = tmpBuffer[0];
        int windowY = tmpBuffer2[0];
        GLFW.getWindowSize(window.getWindowHandle(), tmpBuffer, tmpBuffer2);
        int windowWidth = tmpBuffer[0];
        int windowHeight = tmpBuffer2[0];
        int overlap;
        int bestOverlap = 0;

        for (Monitor monitor : monitors) {
            DisplayMode mode = getDisplayMode(monitor);

            overlap = Math.max(0,
                    Math.min(windowX + windowWidth, monitor.virtualX + mode.width) - Math.max(windowX, monitor.virtualX))
                    * Math.max(0, Math.min(windowY + windowHeight, monitor.virtualY + mode.height) - Math.max(windowY, monitor.virtualY));

            if (bestOverlap < overlap) {
                bestOverlap = overlap;
                result = monitor;
            }
        }
        return result;
    }

    @Override
    public Monitor[] getMonitors() {
        long[] glfwMonitors = GLFW.getMonitors();
        Monitor[] monitors = new Monitor[glfwMonitors.length];
        for (int i = 0; i < glfwMonitors.length; i++) {
            monitors[i] = NativeApplicationConfiguration.toNativeMonitor(glfwMonitors[i]);
        }
        return monitors;
    }

    @Override
    public DisplayMode[] getDisplayModes() {
        return NativeApplicationConfiguration.getDisplayModes(getMonitor());
    }

    @Override
    public DisplayMode[] getDisplayModes(Monitor monitor) {
        return NativeApplicationConfiguration.getDisplayModes(monitor);
    }

    @Override
    public DisplayMode getDisplayMode() {
        return NativeApplicationConfiguration.getDisplayMode(getMonitor());
    }

    @Override
    public DisplayMode getDisplayMode(Monitor monitor) {
        return NativeApplicationConfiguration.getDisplayMode(monitor);
    }

    @Override
    public int getSafeInsetLeft() {
        return 0;
    }

    @Override
    public int getSafeInsetTop() {
        return 0;
    }

    @Override
    public int getSafeInsetBottom() {
        return 0;
    }

    @Override
    public int getSafeInsetRight() {
        return 0;
    }

    @Override
    public boolean setFullscreenMode(DisplayMode displayMode) {
        window.getInput().resetPollingStates();
        NativeDisplayMode newMode = (NativeDisplayMode) displayMode;
        if (isFullscreen()) {
            NativeDisplayMode currentMode = (NativeDisplayMode) getDisplayMode();
            if (currentMode.getMonitor() == newMode.getMonitor() && currentMode.refreshRate == newMode.refreshRate) {
                // same monitor and refresh rate
                GLFW.setWindowSize(window.getWindowHandle(), newMode.width, newMode.height);
            } else {
                // different monitor and/or refresh rate
                GLFW.setWindowMonitor(window.getWindowHandle(), newMode.getMonitor(), 0, 0, newMode.width, newMode.height,
                        newMode.refreshRate);
            }
        } else {
            // store window position so we can restore it when switching from fullscreen to windowed later
            storeCurrentWindowPositionAndDisplayMode();

            // switch from windowed to fullscreen
            GLFW.setWindowMonitor(window.getWindowHandle(), newMode.getMonitor(), 0, 0, newMode.width, newMode.height,
                    newMode.refreshRate);
        }
        updateFramebufferInfo();

        setVSync(window.getConfig().vSyncEnabled);

        return true;
    }

    private void storeCurrentWindowPositionAndDisplayMode() {
        windowPosXBeforeFullscreen = window.getPositionX();
        windowPosYBeforeFullscreen = window.getPositionY();
        windowWidthBeforeFullscreen = logicalWidth;
        windowHeightBeforeFullscreen = logicalHeight;
        displayModeBeforeFullscreen = getDisplayMode();
    }

    @Override
    public boolean setWindowedMode(int width, int height) {
        window.getInput().resetPollingStates();
        if (!isFullscreen()) {
            GridPoint2 newPos = null;
            boolean centerWindow = false;
            if (width != logicalWidth || height != logicalHeight) {
                centerWindow = true; // recenter the window since its size changed
                newPos = NativeApplicationConfiguration.calculateCenteredWindowPosition((NativeMonitor) getMonitor(), width, height);
            }
            GLFW.setWindowSize(window.getWindowHandle(), width, height);
            if (centerWindow) {
                window.setPosition(newPos.x, newPos.y); // on macOS the centering has to happen _after_ the new window size was set
            }
        } else { // if we were in fullscreen mode, we should consider restoring a previous display mode
            if (displayModeBeforeFullscreen == null) {
                storeCurrentWindowPositionAndDisplayMode();
            }
            if (width != windowWidthBeforeFullscreen || height != windowHeightBeforeFullscreen) { // center the window since its size
                // changed
                GridPoint2 newPos = NativeApplicationConfiguration.calculateCenteredWindowPosition((NativeMonitor) getMonitor(), width,
                        height);
                GLFW.setWindowMonitor(window.getWindowHandle(), 0, newPos.x, newPos.y, width, height,
                        displayModeBeforeFullscreen.refreshRate);
            } else { // restore previous position
                GLFW.setWindowMonitor(window.getWindowHandle(), 0, windowPosXBeforeFullscreen, windowPosYBeforeFullscreen, width,
                        height, displayModeBeforeFullscreen.refreshRate);
            }
        }
        updateFramebufferInfo();
        return true;
    }

    @Override
    public void setTitle(String title) {
        if (title == null) {
            title = "";
        }
        GLFW.setWindowTitle(window.getWindowHandle(), title);
    }

    @Override
    public void setUndecorated(boolean undecorated) {
        getWindow().getConfig().setDecorated(!undecorated);
        GLFW.setWindowAttrib(window.getWindowHandle(), GLFW_DECORATED, undecorated ? GLFW_FALSE : GLFW_TRUE);
    }

    @Override
    public void setResizable(boolean resizable) {
        getWindow().getConfig().setResizable(resizable);
        GLFW.setWindowAttrib(window.getWindowHandle(), GLFW_RESIZABLE, resizable ? GLFW_TRUE : GLFW_FALSE);
    }

    @Override
    public void setVSync(boolean vsync) {
        getWindow().getConfig().vSyncEnabled = vsync;
        GLFW.swapInterval(vsync ? 1 : 0);
    }

    /**
     * Sets the target framerate for the application, when using continuous rendering. Must be positive. The cpu sleeps as needed.
     * Use 0 to never sleep. If there are multiple windows, the value for the first window created is used for all. Default is 0.
     *
     * @param fps fps
     */
    @Override
    public void setForegroundFPS(int fps) {
        getWindow().getConfig().foregroundFPS = fps;
    }

    @Override
    public BufferFormat getBufferFormat() {
        return bufferFormat;
    }

    @Override
    public boolean supportsExtension(String extension) {
        return GLFW.extensionSupported(extension);
    }

    @Override
    public void setContinuousRendering(boolean isContinuous) {
        this.isContinuous = isContinuous;
    }

    @Override
    public boolean isContinuousRendering() {
        return isContinuous;
    }

    @Override
    public void requestRendering() {
        window.requestRendering();
    }

    @Override
    public boolean isFullscreen() {
        return GLFW.getWindowMonitor(window.getWindowHandle()) != 0;
    }

    @Override
    public Cursor newCursor(Pixmap pixmap, int xHotspot, int yHotspot) {
        return new NativeCursor(getWindow(), pixmap, xHotspot, yHotspot);
    }

    @Override
    public void setCursor(Cursor cursor) {
        GLFW.setCursor(getWindow().getWindowHandle(), ((NativeCursor) cursor).glfwCursor);
    }

    @Override
    public void setSystemCursor(SystemCursor systemCursor) {
        NativeCursor.setSystemCursor(getWindow().getWindowHandle(), systemCursor);
    }

    @Override
    public void dispose() {
        GLFW.setFramebufferSizeCallback(window.getWindowHandle(), null);
    }

    public static class NativeDisplayMode extends DisplayMode {
        final long monitorHandle;

        NativeDisplayMode(long monitor, int width, int height, int refreshRate, int bitsPerPixel) {
            super(width, height, refreshRate, bitsPerPixel);
            this.monitorHandle = monitor;
        }

        public long getMonitor() {
            return monitorHandle;
        }
    }

    public static class NativeMonitor extends Monitor {
        final long monitorHandle;

        NativeMonitor(long monitor, int virtualX, int virtualY, String name) {
            super(virtualX, virtualY, name);
            this.monitorHandle = monitor;
        }

        public long getMonitorHandle() {
            return monitorHandle;
        }
    }
}
