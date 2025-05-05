package dev.ultreon.gdx.c;

import org.teavm.interop.Function;

public abstract class Callback extends Function {
    private Callback() {
    }

    public abstract void invoke();
}
