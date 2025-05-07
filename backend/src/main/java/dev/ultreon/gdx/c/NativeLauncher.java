package dev.ultreon.gdx.c;

import com.badlogic.gdx.ApplicationListener;

public class NativeLauncher {

    public static void main(String[] args) {
        try {
            NativeApplicationConfiguration config = new NativeApplicationConfiguration();
            Object appListener = getApplicationListener();
            if(appListener != null) {
                ApplicationListener listener = (ApplicationListener)appListener;
                new NativeApplication(listener, config);
            }
        }
        catch(Throwable t) {
            t.printStackTrace();
            throw t;
        }
    }

    private static Object getApplicationListener() {
        return new ApplicationListener() {
            @Override
            public void create() {

            }

            @Override
            public void resize(int width, int height) {

            }

            @Override
            public void render() {

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
        };
    }
}