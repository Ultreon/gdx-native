
package dev.ultreon.gdx.c;

/**
 * Convenience implementation of {@link NativeWindowListener}. Derive from this class and only overwrite the methods you are
 * interested in.
 *
 * @author badlogic
 */
public class NativeWindowAdapter implements NativeWindowListener {
    @Override
    public void created(NativeWindow window) {
    }

    @Override
    public void iconified(boolean isIconified) {
    }

    @Override
    public void maximized(boolean isMaximized) {
    }

    @Override
    public void focusLost() {
    }

    @Override
    public void focusGained() {
    }

    @Override
    public boolean closeRequested() {
        return true;
    }

    @Override
    public void filesDropped(String[] files) {
    }

    @Override
    public void refreshRequested() {
    }
}
