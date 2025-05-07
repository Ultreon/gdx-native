
package dev.ultreon.gdx.c;

import com.badlogic.gdx.Application;
import dev.ultreon.gdx.c.audio.NativeAudio;

public interface NativeApplicationBase extends Application {

    NativeAudio createAudio(NativeApplicationConfiguration config);

    NativeInput createInput(NativeWindow window);
}
