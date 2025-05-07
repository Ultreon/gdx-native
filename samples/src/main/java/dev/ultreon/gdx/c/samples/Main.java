package dev.ultreon.gdx.c.samples;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import dev.ultreon.gdx.c.NativeApplication;

public class Main implements ApplicationListener {
    private SpriteBatch batch;
    private Texture texture;

    public static void main(String[] args) {
        NativeApplication app = new NativeApplication(new Main());
    }

    @Override
    public void create() {
        batch = new SpriteBatch();
//        texture = new Texture("badlogic.png");
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("Resized to " + width + "x" + height);
    }

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0.2f, 1);

        batch.begin();
        batch.draw(texture, 0, 0);
        batch.end();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}