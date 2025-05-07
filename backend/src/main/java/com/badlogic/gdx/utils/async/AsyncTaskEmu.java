package com.badlogic.gdx.utils.async;

import dev.ultreon.gdx.c.gen.Emulate;

@Emulate(AsyncTask.class)
public interface AsyncTaskEmu<T> {
    public T call() throws Exception;
}