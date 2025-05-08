package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.Pixmap.Filter;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmapEmu;
import dev.ultreon.gdx.c.NativeApplication;
import dev.ultreon.gdx.c.NativeApplicationConfiguration;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmapNative;
import com.badlogic.gdx.graphics.g2d.PixmapNativeInterface;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import dev.ultreon.gdx.c.gen.Emulate;

import java.nio.ByteBuffer;

@Emulate(value = Pixmap.class)
public class PixmapEmu implements Disposable, PixmapNativeInterface {
    public static PixmapEmu createFromFrameBuffer(int x, int y, int w, int h) {
        Gdx.gl.glPixelStorei(GL20.GL_PACK_ALIGNMENT, 1);
        final PixmapEmu pixmap = new PixmapEmu(w, h, Format.RGBA8888);
        ByteBuffer pixels = pixmap.getPixels();
        Gdx.gl.glReadPixels(x, y, w, h, GL20.GL_RGBA, GL20.GL_UNSIGNED_BYTE, pixels);
        pixmap.getNative().copyToHeap();
        return pixmap;
    }

    Blending blending = Blending.SourceOver;
    Filter filter = Filter.BiLinear;

    private int color = 0;
    private Gdx2DPixmapEmu nativePixmap;
    private boolean disposed;

    public PixmapEmu(FileHandle file) {
        String path = file.path();
        NativeApplicationConfiguration config = ((NativeApplication)Gdx.app).getConfig();
        if(!file.exists()) {
            // Add a way to debug when assets was not loaded in preloader.
            throw new GdxRuntimeException("File is null, it does not exist: " + path);
        }
        byte[] bytes = file.readBytes();
        nativePixmap = new Gdx2DPixmapEmu(bytes, 0, bytes.length, 0);
    }

    public PixmapEmu(byte[] encodedData, int offset, int len) {
        nativePixmap = new Gdx2DPixmapEmu(encodedData, offset, len, 0);
    }

    public PixmapEmu(ByteBuffer encodedData, int offset, int len) {
        throw new GdxRuntimeException("PixmapEmu constructor not supported");
//        if (!encodedData.isDirect()) throw new GdxRuntimeException("Couldn't load pixmap from non-direct ByteBuffer");
//        try {
//            nativePixmap = new Gdx2DPixmapEmu(encodedData, offset, len, 0);
//            initPixmapEmu(-1, -1, null, null);
//        } catch (IOException e) {
//            throw new GdxRuntimeException("Couldn't load pixmap from image data", e);
//        }
    }

    public PixmapEmu(int width, int height, Format format) {
        nativePixmap = new Gdx2DPixmapEmu(width, height, Format.toGdx2DPixmapFormat(format));
        setColor(0, 0, 0, 0);
        fill();
    }

    @Override
    public Gdx2DPixmapNative getNative() {
        return nativePixmap.getNative();
    }

    public PixmapEmu(Gdx2DPixmapEmu pixmap) {
        nativePixmap = pixmap;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setColor(float r, float g, float b, float a) {
        this.color = Color.rgba8888(r, g, b, a);
    }

    public void setColor(Color color) {
        setColor(color.r, color.g, color.b, color.a);
    }

    public void fill() {
        nativePixmap.clear(color);
    }

    public void drawLine(int x, int y, int x2, int y2) {
        nativePixmap.drawLine(x, y, x2, y2, color);
    }

    public void drawRectangle(int x, int y, int width, int height) {
        nativePixmap.drawRect(x, y, width, height, color);
    }

    public void drawPixmap(PixmapEmu pixmap, int x, int y) {
        drawPixmap(pixmap, x, y, 0, 0, pixmap.getWidth(), pixmap.getHeight());
    }

    public void drawPixmap(PixmapEmu pixmap, int x, int y, int srcx, int srcy, int srcWidth, int srcHeight) {
        nativePixmap.drawPixmap(pixmap.nativePixmap, srcx, srcy, x, y, srcWidth, srcHeight);
    }

    public void drawPixmap(PixmapEmu pixmap, int srcx, int srcy, int srcWidth, int srcHeight, int dstx, int dsty, int dstWidth, int dstHeight) {
        nativePixmap.drawPixmap(pixmap.nativePixmap, srcx, srcy, srcWidth, srcHeight, dstx, dsty, dstWidth, dstHeight);
    }

    public void fillRectangle(int x, int y, int width, int height) {
        nativePixmap.fillRect(x, y, width, height, color);
    }

    public void drawCircle(int x, int y, int radius) {
        nativePixmap.drawCircle(x, y, radius, color);
    }

    public void fillCircle(int x, int y, int radius) {
        nativePixmap.fillCircle(x, y, radius, color);
    }

    public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        nativePixmap.fillTriangle(x1, y1, x2, y2, x3, y3, color);
    }

    public int getWidth() {
        return nativePixmap.getWidth();
    }

    public int getHeight() {
        return nativePixmap.getHeight();
    }

    @Override
    public void dispose() {
        if (disposed) throw new GdxRuntimeException("PixmapEmu already disposed!");
        nativePixmap.dispose();
        disposed = true;
    }

    public boolean isDisposed () {
        return disposed;
    }

    public int getGLFormat () {
        return nativePixmap.getGLFormat();
    }

    public int getGLInternalFormat () {
        return nativePixmap.getGLInternalFormat();
    }

    public int getGLType () {
        return nativePixmap.getGLType();
    }

    public ByteBuffer getPixels() {
        return nativePixmap.getBuffer();
    }

    public void setPixels(ByteBuffer pixels) {
        if (!pixels.isDirect())
            throw new GdxRuntimeException("Couldn't setPixels from non-direct ByteBuffer");
        ByteBuffer buffer = nativePixmap.getBuffer();
        BufferUtils.copy(pixels, buffer, buffer.limit());
    }

    public int getPixel(int x, int y) {
        return nativePixmap.getPixel(x, y);
    }

    public void drawPixel(int x, int y) {
        nativePixmap.setPixel(x, y, color);
    }

    public void drawPixel(int x, int y, int color) {
        nativePixmap.setPixel(x, y, color);
    }

    public Format getFormat () {
        return Format.fromGdx2DPixmapFormat(nativePixmap.getFormat());
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
        nativePixmap.setScale(filter == Filter.NearestNeighbour ? Gdx2DPixmap.GDX2D_SCALE_NEAREST : Gdx2DPixmap.GDX2D_SCALE_LINEAR);
    }

    public Filter getFilter() {
        return filter;
    }

    public void setBlending(Blending blending) {
        this.blending = blending;
        nativePixmap.setBlend(blending == Blending.None ? 0 : 1);
    }

    public Blending getBlending () {
        return blending;
    }
}