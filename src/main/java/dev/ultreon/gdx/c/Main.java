package dev.ultreon.gdx.c;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.GL32;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import dev.ultreon.gdx.c.glfw.GLFW;
import dev.ultreon.gdx.c.opengl.OpenGL;

public class Main implements ApplicationListener {
    private SpriteBatch batch;
    private Texture texture;

    public static void main(String[] args) {
        NativeApplication application = new NativeApplication(new Main());
    }

    @Override
    public void create() {
        batch = new SpriteBatch();
        texture = new Texture("badlogic.png");
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {
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
        batch.dispose();
        texture.dispose();
    }
}