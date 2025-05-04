package dev.ultreon.gdx.c;

import com.badlogic.gdx.graphics.GL32;

public class Main {
    public static void main(String[] args) {
        if (!GLFW.init()) {
            System.err.println("GLFW init failed");
            return;
        }

        long window = GLFW.createWindow(800, 600, "Hello World!", 0, 0);
        if (window == 0) {
            System.err.println("Window creation failed");
            GLFW.terminate();
            return;
        }

        GLFW.makeContextCurrent(window);

        while (!GLFW.windowShouldClose(window)) {
            GLFW.pollEvents();
            OpenGL.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
            OpenGL.glClear(GL32.GL_COLOR_BUFFER_BIT);
            GLFW.swapBuffers(window);
        }

        GLFW.terminate();
    }
}