package com.badlogic.gdx.utils.reflect;

import dev.ultreon.gdx.c.gen.Emulate;

@Emulate(Field.class)
public final class FieldEmu extends FieldGen{
    public FieldEmu(java.lang.reflect.Field field) {
        super(field);
    }
}