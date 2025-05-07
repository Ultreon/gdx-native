package com.badlogic.gdx.graphics.glutils;

import dev.ultreon.gdx.c.gen.Emulate;

@Emulate(IndexArray.class)
public class IndexArrayEmu extends IndexBufferObject {
    public IndexArrayEmu(int maxIndices) {
        super(maxIndices);
    }
}