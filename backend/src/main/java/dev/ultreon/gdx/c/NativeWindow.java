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

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.Os;
import com.badlogic.gdx.utils.SharedLibraryLoader;
import dev.ultreon.gdx.c.glfw.*;
import org.teavm.interop.Address;
import org.teavm.interop.Function;

import java.util.HashMap;
import java.util.Map;

import static dev.ultreon.gdx.c.glfw.GLFW.*;

public class NativeWindow implements Disposable {
    private static final Map<Address, NativeWindow> windows = new HashMap<>();
    private long windowHandle;
    final ApplicationListener listener;
    private final Array<LifecycleListener> lifecycleListeners;
    final NativeApplicationBase application;
    private boolean listenerInitialized = false;
    NativeWindowListener windowListener;
    private NativeGraphics graphics;
    private NativeInput input;
    private final NativeApplicationConfiguration config;
    private final Array<Runnable> runnables = new Array<>();
    private final Array<Runnable> executedRunnables = new Array<>();
    private final int[] tmpBuffer;
    private final int[] tmpBuffer2;
    boolean iconified = false;
    boolean focused = false;
    boolean asyncResized = false;
    private boolean requestRendering = false;

    public static NativeWindow byAddress(Address windowHandle) {
        return windows.get(windowHandle);
    }
    
    private final GLFWWindowFocusCallback focusCallback = Function.get(GLFWWindowFocusCallback.class, NativeWindow.class, "focusCallback")/* = new GLFWWindowFocusCallback() {
        @Override
        public void invoke(Address windowHandle, final boolean focused) {
            postRunnable(new Runnable() {
                @Override
                public void run() {
                    if (focused) {
                        if (config.pauseWhenLostFocus) {
                            synchronized (lifecycleListeners) {
                                for (LifecycleListener lifecycleListener : lifecycleListeners) {
                                    lifecycleListener.resume();
                                }
                            }
                            listener.resume();
                        }
                        if (windowListener != null) {
                            windowListener.focusGained();
                        }
                    } else {
                        if (windowListener != null) {
                            windowListener.focusLost();
                        }
                        if (config.pauseWhenLostFocus) {
                            synchronized (lifecycleListeners) {
                                for (LifecycleListener lifecycleListener : lifecycleListeners) {
                                    lifecycleListener.pause();
                                }
                            }
                            listener.pause();
                        }
                    }
                    NativeWindow.this.focused = focused;
                }
            });
        }
    }*/;

    public static void focusCallback(Address windowHandle, boolean focused) {
        NativeWindow window = windows.get(windowHandle);
        window.postRunnable(() -> {
            if (focused) {
                if (window.config.pauseWhenLostFocus) {
                    synchronized (window.lifecycleListeners) {
                        for (LifecycleListener lifecycleListener : window.lifecycleListeners) {
                            lifecycleListener.resume();
                        }
                    }
                    window.listener.resume();
                }
                if (window.windowListener != null) {
                    window.windowListener.focusGained();
                }
            } else {
                if (window.windowListener != null) {
                    window.windowListener.focusLost();
                }
                if (window.config.pauseWhenLostFocus) {
                    synchronized (window.lifecycleListeners) {
                        for (LifecycleListener lifecycleListener : window.lifecycleListeners) {
                            lifecycleListener.pause();
                        }
                    }
                    window.listener.pause();
                }
            }
            window.focused = focused;
        });
    }

    private final GLFWWindowIconifyCallback iconifyCallback = Function.get(GLFWWindowIconifyCallback.class, NativeWindow.class, "iconifyCallback");

    private final GLFWWindowMaximizeCallback maximizeCallback = Function.get(GLFWWindowMaximizeCallback.class, NativeWindow.class, "maximizeCallback");

    private final GLFWWindowCloseCallback closeCallback = Function.get(GLFWWindowCloseCallback.class, NativeWindow.class, "closeCallback");

    private final GLFWDropCallback dropCallback = Function.get(GLFWDropCallback.class, NativeWindow.class, "dropCallback");

    private final GLFWWindowRefreshCallback refreshCallback = Function.get(GLFWWindowRefreshCallback.class, NativeWindow.class, "refreshCallback");

    public static void iconifyCallback(Address windowHandle, boolean iconified) {
        NativeWindow window = windows.get(windowHandle);
        window.postRunnable(() -> {
            if (window.windowListener != null) {
                window.windowListener.iconified(iconified);
            }
            window.iconified = iconified;
            if (iconified) {
                if (window.config.pauseWhenMinimized) {
                    synchronized (window.lifecycleListeners) {
                        for (LifecycleListener lifecycleListener : window.lifecycleListeners) {
                            lifecycleListener.pause();
                        }
                    }
                    window.listener.pause();
                }
            } else {
                if (window.config.pauseWhenMinimized) {
                    synchronized (window.lifecycleListeners) {
                        for (LifecycleListener lifecycleListener : window.lifecycleListeners) {
                            lifecycleListener.resume();
                        }
                    }
                    window.listener.resume();
                }
            }
        });
    }

    public static void maximizeCallback(Address windowHandle, boolean maximized) {
        NativeWindow window = windows.get(windowHandle);
        window.postRunnable(() -> {
            if (window.windowListener != null) {
                window.windowListener.maximized(maximized);
            }
        });
    }

    public static void closeCallback(Address windowHandle) {
        NativeWindow window = windows.get(windowHandle);
        window.postRunnable(() -> {
            if (window.windowListener != null) {
                if (!window.windowListener.closeRequested()) {
                    setWindowShouldClose(windowHandle.toLong(), false);
                }
            }
        });
    }

    public static void dropCallback(Address windowHandle, int count, long names) {
        NativeWindow window = windows.get(windowHandle);
        final String[] files = GLFWDropCallback.names(count, names);
        window.postRunnable(() -> {
            if (window.windowListener != null) {
                window.windowListener.filesDropped(files);
            }
        });
    }

    public static void refreshCallback(Address windowHandle) {
        NativeWindow window = windows.get(windowHandle);
        window.postRunnable(() -> {
            if (window.windowListener != null) {
                window.windowListener.refreshRequested();
            }
        });
    }
    NativeWindow(ApplicationListener listener, Array<LifecycleListener> lifecycleListeners, NativeApplicationConfiguration config,
                 NativeApplicationBase application) {
        this.listener = listener;
        this.lifecycleListeners = lifecycleListeners;
        this.windowListener = config.windowListener;
        this.config = config;
        this.application = application;
        this.tmpBuffer = new int[1];
        this.tmpBuffer2 = new int[1];
    }

    void create(long windowHandle) {
        this.windowHandle = windowHandle;
        this.input = application.createInput(this);
        this.graphics = new NativeGraphics(this);

        setWindowFocusCallback(windowHandle, focusCallback);
        setWindowIconifyCallback(windowHandle, iconifyCallback);
        setWindowMaximizeCallback(windowHandle, maximizeCallback);
        setWindowCloseCallback(windowHandle, closeCallback);
        setDropCallback(windowHandle, dropCallback);
        setWindowRefreshCallback(windowHandle, refreshCallback);

        if (windowListener != null) {
            windowListener.created(this);
        }
    }

    /**
     * @return the {@link ApplicationListener} associated with this window
     **/
    public ApplicationListener getListener() {
        return listener;
    }

    /**
     * @return the {@link NativeWindowListener} set on this window
     **/
    public NativeWindowListener getWindowListener() {
        return windowListener;
    }

    public void setWindowListener(NativeWindowListener listener) {
        this.windowListener = listener;
    }

    /**
     * Post a {@link Runnable} to this window's event queue. Use this if you access statics like {@link Gdx#graphics} in your
     * runnable instead of {@link Application#postRunnable(Runnable)}.
     */
    public void postRunnable(Runnable runnable) {
        synchronized (runnables) {
            runnables.add(runnable);
        }
    }

    /**
     * Sets the position of the window in logical coordinates. All monitors span a virtual surface together. The coordinates are
     * relative to the first monitor in the virtual surface.
     **/
    public void setPosition(int x, int y) {
        if (getPlatform() == GLFW_PLATFORM_WAYLAND) return;
        setWindowPos(windowHandle, x, y);
    }

    /**
     * @return the window position in logical coordinates. All monitors span a virtual surface together. The coordinates are
     * relative to the first monitor in the virtual surface.
     **/
    public int getPositionX() {
        getWindowPos(windowHandle, tmpBuffer, tmpBuffer2);
        return tmpBuffer[0];
    }

    /**
     * @return the window position in logical coordinates. All monitors span a virtual surface together. The coordinates are
     * relative to the first monitor in the virtual surface.
     **/
    public int getPositionY() {
        getWindowPos(windowHandle, tmpBuffer, tmpBuffer2);
        return tmpBuffer2[0];
    }

    /**
     * Sets the visibility of the window. Invisible windows will still call their {@link ApplicationListener}
     */
    public void setVisible(boolean visible) {
        if (visible) {
            showWindow(windowHandle);
        } else {
            hideWindow(windowHandle);
        }
    }

    /**
     * Closes this window and pauses and disposes the associated {@link ApplicationListener}.
     */
    public void closeWindow() {
        setWindowShouldClose(windowHandle, true);
    }

    /**
     * Minimizes (iconifies) the window. Iconified windows do not call their {@link ApplicationListener} until the window is
     * restored.
     */
    public void iconifyWindow() {
        GLFW.iconifyWindow(windowHandle);
    }

    /**
     * Whether the window is iconfieid
     */
    public boolean isIconified() {
        return iconified;
    }

    /**
     * De-minimizes (de-iconifies) and de-maximizes the window.
     */
    public void restoreWindow() {
        GLFW.restoreWindow(windowHandle);
    }

    /**
     * Maximizes the window.
     */
    public void maximizeWindow() {
        GLFW.maximizeWindow(windowHandle);
    }

    /**
     * Brings the window to front and sets input focus. The window should already be visible and not iconified.
     */
    public void focusWindow() {
        GLFW.focusWindow(windowHandle);
    }

    public boolean isFocused() {
        return focused;
    }

    /**
     * Sets the icon that will be used in the window's title bar. Has no effect in macOS, which doesn't use window icons.
     *
     * @param image One or more images. The one closest to the system's desired size will be scaled. Good sizes include 16x16,
     *              32x32 and 48x48. Pixmap format {@link Pixmap.Format#RGBA8888 RGBA8888} is preferred so
     *              the images will not have to be copied and converted. The chosen image is copied, and the provided Pixmaps are not
     *              disposed.
     */
    public void setIcon(Pixmap... image) {
        setIcon(windowHandle, image);
    }

    static void setIcon(long windowHandle, String[] imagePaths, Files.FileType imageFileType) {
        if (SharedLibraryLoader.os == Os.MacOsX) return;

        Pixmap[] pixmaps = new Pixmap[imagePaths.length];
        for (int i = 0; i < imagePaths.length; i++) {
            pixmaps[i] = new Pixmap(Gdx.files.getFileHandle(imagePaths[i], imageFileType));
        }

        setIcon(windowHandle, pixmaps);

        for (Pixmap pixmap : pixmaps) {
            pixmap.dispose();
        }
    }

    static void setIcon(long windowHandle, Pixmap[] images) {
//        if (SharedLibraryLoader.os == Os.MacOsX) return;
//        if (getPlatform() == GLFW_PLATFORM_WAYLAND) return;
//
//        GLFWImage.Buffer buffer = GLFWImage.malloc(images.length);
//        Pixmap[] tmpPixmaps = new Pixmap[images.length];
//
//        for (int i = 0; i < images.length; i++) {
//            Pixmap pixmap = images[i];
//
//            if (pixmap.getFormat() != Pixmap.Format.RGBA8888) {
//                Pixmap rgba = new Pixmap(pixmap.getWidth(), pixmap.getHeight(), Pixmap.Format.RGBA8888);
//                rgba.setBlending(Pixmap.Blending.None);
//                rgba.drawPixmap(pixmap, 0, 0);
//                tmpPixmaps[i] = rgba;
//                pixmap = rgba;
//            }
//
//            GLFWImage icon = GLFWImage.malloc();
//            icon.set(pixmap.getWidth(), pixmap.getHeight(), pixmap.getPixels());
//            buffer.put(icon);
//
//            icon.free();
//        }
//
//        setWindowIcon(windowHandle, buffer.buffer.length, buffer.toAddress().toLong());
//
//        buffer.free();
//        for (Pixmap pixmap : tmpPixmaps) {
//            if (pixmap != null) {
//                pixmap.dispose();
//            }
//        }
    }

    public void setTitle(CharSequence title) {
        setWindowTitle(windowHandle, title.toString());
    }

    /**
     * Sets minimum and maximum size limits for the window. If the window is full screen or not resizable, these limits are
     * ignored. Use -1 to indicate an unrestricted dimension.
     */
    public void setSizeLimits(int minWidth, int minHeight, int maxWidth, int maxHeight) {
        setSizeLimits(windowHandle, minWidth, minHeight, maxWidth, maxHeight);
    }

    static void setSizeLimits(long windowHandle, int minWidth, int minHeight, int maxWidth, int maxHeight) {
        setWindowSizeLimits(windowHandle, minWidth > -1 ? minWidth : GLFW_DONT_CARE,
                minHeight > -1 ? minHeight : GLFW_DONT_CARE, maxWidth > -1 ? maxWidth : GLFW_DONT_CARE,
                maxHeight > -1 ? maxHeight : GLFW_DONT_CARE);
    }

    NativeGraphics getGraphics() {
        return graphics;
    }

    NativeInput getInput() {
        return input;
    }

    public long getWindowHandle() {
        return windowHandle;
    }

    void windowHandleChanged(Address windowHandle) {
        this.windowHandle = windowHandle.toLong();
        input.windowHandleChanged(windowHandle.toLong());
    }

    boolean update() {
        if (!listenerInitialized) {
            initializeListener();
        }
        synchronized (runnables) {
            executedRunnables.addAll(runnables);
            runnables.clear();
        }
        for (Runnable runnable : executedRunnables) {
            runnable.run();
        }
        boolean shouldRender = executedRunnables.size > 0 || graphics.isContinuousRendering();
        executedRunnables.clear();

        if (!iconified) input.update();

        synchronized (this) {
            shouldRender |= requestRendering && !iconified;
            requestRendering = false;
        }

        // In case glfw_async is used, we need to resize outside the GLFW
        if (asyncResized) {
            asyncResized = false;
            graphics.updateFramebufferInfo();
            graphics.gl20.glViewport(0, 0, graphics.getBackBufferWidth(), graphics.getBackBufferHeight());
            listener.resize(graphics.getWidth(), graphics.getHeight());
            graphics.update();
            listener.render();
            swapBuffers(windowHandle);
            return true;
        }

        if (shouldRender) {
            graphics.update();
            listener.render();
            swapBuffers(windowHandle);
        }

        if (!iconified) input.prepareNext();

        return shouldRender;
    }

    void requestRendering() {
        synchronized (this) {
            this.requestRendering = true;
        }
    }

    boolean shouldClose() {
        return windowShouldClose(windowHandle);
    }

    NativeApplicationConfiguration getConfig() {
        return config;
    }

    boolean isListenerInitialized() {
        return listenerInitialized;
    }

    void initializeListener() {
        if (!listenerInitialized) {
            listener.create();
            listener.resize(graphics.getWidth(), graphics.getHeight());
            listenerInitialized = true;
        }
    }

    void makeCurrent() {
        Gdx.graphics = graphics;
        Gdx.gl32 = graphics.getGL32();
        Gdx.gl31 = Gdx.gl32 != null ? Gdx.gl32 : graphics.getGL31();
        Gdx.gl30 = Gdx.gl31 != null ? Gdx.gl31 : graphics.getGL30();
        Gdx.gl20 = Gdx.gl30 != null ? Gdx.gl30 : graphics.getGL20();
        Gdx.gl = Gdx.gl20;
        Gdx.input = input;

        makeContextCurrent(windowHandle);
    }

    @Override
    public void dispose() {
        listener.pause();
        listener.dispose();
        NativeCursor.dispose(this);
        graphics.dispose();
        input.dispose();
        setWindowFocusCallback(windowHandle, null);
        setWindowIconifyCallback(windowHandle, null);
        setWindowCloseCallback(windowHandle, null);
        setDropCallback(windowHandle, null);
        destroyWindow(windowHandle);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (windowHandle ^ (windowHandle >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        NativeWindow other = (NativeWindow) obj;
        if (windowHandle != other.windowHandle) return false;
        return true;
    }

    public void flash() {
        GLFW.requestWindowAttention(windowHandle);
    }
}
