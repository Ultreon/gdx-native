package com.badlogic.gdx.utils;

import dev.ultreon.gdx.c.gen.Emulate;

@Emulate(value = SharedLibraryLoader.class, updateCode = true)
public class SharedLibraryLoaderEmu {
    public void load (String libraryName) {
        throw new UnsupportedOperationException("SharedLibraryLoader not supported on TeaVM C backend");
    }
}