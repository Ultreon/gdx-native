package dev.ultreon.gdx.c;

import org.teavm.interop.Address;
import org.teavm.interop.Import;
import org.teavm.interop.c.Include;

@Include("GLFW/glfw3.h")
public class GLFW {
    public static class GLFWWindow extends GLFW {

    }

    @Import(name = "glfwInit")
    private static native boolean glfwInit();

    @Import(name = "glfwCreateWindow")
    private static native Address glfwCreateWindowNative(int width, int height, String title, 
            Address monitor, Address share);

    @Import(name = "glfwWindowShouldClose")
    private static native boolean glfwWindowShouldClose(Address window);

    @Import(name = "glfwSwapBuffers")
    private static native void glfwSwapBuffers(Address window);

    @Import(name = "glfwPollEvents")
    private static native void glfwPollEvents();

    @Import(name = "glfwTerminate")
    private static native void glfwTerminate();

    @Import(name = "glfwMakeContextCurrent")
    private static native void glfwMakeContextCurrent(Address window);

    @Import(name = "glfwGetCurrentContext")
    private static native Address glfwGetCurrentContext();

    @Import(name = "glfwSetErrorCallback")
    private static native void glfwSetErrorCallback(Address callback);

    @Import(name = "glfwGetVersion")
    private static native void glfwGetVersion(Address major, Address minor, Address rev);

    @Import(name = "glfwGetVersionString")
    private static native String glfwGetVersionString();

    @Import(name = "glfwExtensionSupported")
    private static native boolean glfwExtensionSupported(String extension);

    @Import(name = "glfwGetPrimaryMonitor")
    private static native Address glfwGetPrimaryMonitor();

    @Import(name = "glfwGetMonitorPos")
    private static native void glfwGetMonitorPos(Address monitor, Address xpos, Address ypos);

    @Import(name = "glfwGetMonitorWorkarea")
    private static native void glfwGetMonitorWorkarea(Address monitor, Address xpos, Address ypos, Address width, Address height);

    @Import(name = "glfwGetMonitorPhysicalSize")
    private static native void glfwGetMonitorPhysicalSize(Address monitor, Address widthMM, Address heightMM);

    @Import(name = "glfwGetMonitorContentScale")
    private static native void glfwGetMonitorContentScale(Address monitor, Address xscale, Address yscale);

    @Import(name = "glfwGetMonitorName")
    private static native String glfwGetMonitorName(Address monitor);

    @Import(name = "glfwSetMonitorUserPointer")
    private static native void glfwSetMonitorUserPointer(Address monitor, Address pointer);

    @Import(name = "glfwGetMonitorUserPointer")
    private static native Address glfwGetMonitorUserPointer(Address monitor);

    @Import(name = "glfwSetMonitorCallback")
    private static native void glfwSetMonitorCallback(Address callback);

    @Import(name = "glfwGetVideoMode")
    private static native Address glfwGetVideoMode(Address monitor);

    @Import(name = "glfwGetVideoModes")
    private static native Address glfwGetVideoModes(Address monitor);

    @Import(name = "glfwSetGamma")
    private static native void glfwSetGamma(Address monitor, float gamma);

    @Import(name = "glfwGetGammaRamp")
    private static native Address glfwGetGammaRamp(Address monitor);

    @Import(name = "glfwSetGammaRamp")
    private static native void glfwSetGammaRamp(Address monitor, Address ramp);

    @Import(name = "glfwDefaultWindowHints")
    private static native void glfwDefaultWindowHints();

    @Import(name = "glfwWindowHint")
    private static native void glfwWindowHint(int hint, int value);

    @Import(name = "glfwWindowHintString")
    private static native void glfwWindowHintString(int hint, String value);

    @Import(name = "glfwDestroyWindow")
    private static native void glfwDestroyWindow(Address window);

    @Import(name = "glfwWindowHintString")
    private static native void glfwWindowHintString(int hint, Address value);

    @Import(name = "glfwSetWindowTitle")
    private static native void glfwSetWindowTitle(Address window, String title);

    @Import(name = "glfwSetWindowIcon")
    private static native void glfwSetWindowIcon(Address window, int count, Address images);

    @Import(name = "glfwSetWindowPos")
    private static native void glfwSetWindowPos(Address window, int xpos, int ypos);

    @Import(name = "glfwGetWindowPos")
    private static native void glfwGetWindowPos(Address window, Address xpos, Address ypos);

    @Import(name = "glfwSetWindowSizeLimits")
    private static native void glfwSetWindowSizeLimits(Address window, int minwidth, int minheight, int maxwidth, int maxheight);

    public static boolean init() {
        return glfwInit();
    }

    public static long createWindow(int width, int height, String title, long monitor, long share) {
        return glfwCreateWindowNative(width, height, title,
                Address.fromLong(monitor), Address.fromLong(share)).toLong();
    }

    public static boolean windowShouldClose(long window) {
        return glfwWindowShouldClose(Address.fromLong(window));
    }

    public static void swapBuffers(long window) {
        glfwSwapBuffers(Address.fromLong(window));
    }

    public static void pollEvents() {
        glfwPollEvents();
    }

    public static void terminate() {
        glfwTerminate();
    }

    public static void makeContextCurrent(long window) {
        glfwMakeContextCurrent(Address.fromLong(window));
    }

    public static long getCurrentContext() {
        return glfwGetCurrentContext().toLong();
    }

    public static void setErrorCallback(long callback) {
        glfwSetErrorCallback(Address.fromLong(callback));
    }

    public static void getVersion(long[] major, long[] minor, long[] rev) {
        glfwGetVersion(Address.ofData(major), Address.ofData(minor), Address.ofData(rev));
    }

    public static String getVersionString() {
        return glfwGetVersionString();
    }

    public static boolean extensionSupported(String extension) {
        return glfwExtensionSupported(extension);
    }

    public static long getPrimaryMonitor() {
        return glfwGetPrimaryMonitor().toLong();
    }

    public static void getMonitorPos(long monitor, long[] xpos, long[] ypos) {
        glfwGetMonitorPos(Address.fromLong(monitor), Address.ofData(xpos), Address.ofData(ypos));
    }

    public static void getMonitorWorkarea(long monitor, long[] xpos, long[] ypos, long[] width, long[] height) {
        glfwGetMonitorWorkarea(Address.fromLong(monitor), Address.ofData(xpos), Address.ofData(ypos), Address.ofData(width), Address.ofData(height));
    }

    public static void getMonitorPhysicalSize(long monitor, long[] widthMM, long[] heightMM) {
        glfwGetMonitorPhysicalSize(Address.fromLong(monitor), Address.ofData(widthMM), Address.ofData(heightMM));
    }

    public static void getMonitorContentScale(long monitor, long[] xscale, long[] yscale) {
        glfwGetMonitorContentScale(Address.fromLong(monitor), Address.ofData(xscale), Address.ofData(yscale));
    }

    public static String getMonitorName(long monitor) {
        return glfwGetMonitorName(Address.fromLong(monitor));
    }

    public static void setMonitorUserPointer(long monitor, long pointer) {
        glfwSetMonitorUserPointer(Address.fromLong(monitor), Address.fromLong(pointer));
    }

    public static long getMonitorUserPointer(long monitor) {
        return glfwGetMonitorUserPointer(Address.fromLong(monitor)).toLong();
    }

    public static void setMonitorCallback(long callback) {
        glfwSetMonitorCallback(Address.fromLong(callback));
    }

    public static long getVideoMode(long monitor) {
        return glfwGetVideoMode(Address.fromLong(monitor)).toLong();
    }

    public static long getVideoModes(long monitor) {
        return glfwGetVideoModes(Address.fromLong(monitor)).toLong();
    }

    public static void setGamma(long monitor, float gamma) {
        glfwSetGamma(Address.fromLong(monitor), gamma);
    }

    public static long getGammaRamp(long monitor) {
        return glfwGetGammaRamp(Address.fromLong(monitor)).toLong();
    }

    public static void setGammaRamp(long monitor, long ramp) {
        glfwSetGammaRamp(Address.fromLong(monitor), Address.fromLong(ramp));
    }

    public static void defaultWindowHints() {
        glfwDefaultWindowHints();
    }

    public static void windowHint(int hint, int value) {
        glfwWindowHint(hint, value);
    }

    public static void windowHintString(int hint, String value) {
        glfwWindowHintString(hint, value);
    }

    public static void windowHintString(int hint, long value) {
        glfwWindowHintString(hint, Address.fromLong(value));
    }

    public static void destroyWindow(long window) {
        glfwDestroyWindow(Address.fromLong(window));
    }

    public static void setWindowTitle(long window, String title) {
        glfwSetWindowTitle(Address.fromLong(window), title);
    }

    public static void setWindowIcon(long window, int count, long images) {
        glfwSetWindowIcon(Address.fromLong(window), count, Address.fromLong(images));
    }

    public static void setWindowPos(long window, int xpos, int ypos) {
        glfwSetWindowPos(Address.fromLong(window), xpos, ypos);
    }

    public static void getWindowPos(long window, long[] xpos, long[] ypos) {
        glfwGetWindowPos(Address.fromLong(window), Address.ofData(xpos), Address.ofData(ypos));
    }

    public static void setWindowSizeLimits(long window, int minwidth, int minheight, int maxwidth, int maxheight) {
        glfwSetWindowSizeLimits(Address.fromLong(window), minwidth, minheight, maxwidth, maxheight);
    }
}