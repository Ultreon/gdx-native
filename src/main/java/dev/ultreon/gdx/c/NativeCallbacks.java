package dev.ultreon.gdx.c;

public class NativeCallbacks {
    public static void onError(int error, String description) {
        System.err.println("GLFW error: " + error + ": " + description);
    }
}
