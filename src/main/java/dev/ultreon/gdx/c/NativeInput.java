
package dev.ultreon.gdx.c;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.utils.Disposable;

public interface NativeInput extends Input, Disposable {

    void windowHandleChanged(long windowHandle);

    void update();

    void prepareNext();

    void resetPollingStates();
}
