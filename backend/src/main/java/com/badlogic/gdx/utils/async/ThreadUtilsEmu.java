package com.badlogic.gdx.utils.async;

import dev.ultreon.gdx.c.gen.Emulate;

@Emulate(ThreadUtils.class)
public class ThreadUtilsEmu {
    public static void yield() {
    }
}