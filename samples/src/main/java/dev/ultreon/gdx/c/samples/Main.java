package dev.ultreon.gdx.c.samples;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import dev.ultreon.gdx.c.NativeApplication;

import java.io.File;

public class Main implements ApplicationListener {
    private SpriteBatch batch;
    private Texture texture;

    public static void main(String[] args) {
        System.out.println("Starting...");
        System.out.println("Current directory: " + new File(".").getAbsolutePath());

        try {
            NativeApplication app = new NativeApplication(new Main());
        } catch (Throwable t) {
            t.printStackTrace();
            throw t;
        }
    }

    @Override
    public void create() {
        System.out.println("Creating sprite batch and texture...");
        batch = new SpriteBatch();
        texture = new Texture("badlogic.png");

        System.out.println("Created sprite batch and texture.");
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("Resized to " + width + "x" + height);
    }

    @Override
    public void render() {
        System.out.println("Rendering...");
        ScreenUtils.clear(0, 0, 0.2f, 1);

        batch.begin();
        batch.draw(texture, 0, 0);
        batch.end();
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void resume() {
        System.out.println("Resumed");
    }

    @Override
    public void dispose() {
        System.out.println("Disposing...");
        batch.dispose();
        texture.dispose();
        System.out.println("Disposed.");
    }
}