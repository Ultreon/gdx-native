
package dev.ultreon.gdx.c.audio;

import com.badlogic.gdx.Audio;
import com.badlogic.gdx.utils.Disposable;

public interface NativeAudio extends Audio, Disposable {

    void update();
}
