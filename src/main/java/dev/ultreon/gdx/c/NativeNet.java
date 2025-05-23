/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	 http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package dev.ultreon.gdx.c;

import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.*;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.Os;
import com.badlogic.gdx.utils.SharedLibraryLoader;

import java.awt.*;
import java.net.URI;

/**
 * LWJGL implementation of the {@link Net} API, it could be reused in other Desktop backends since it doesn't depend on LWJGL.
 *
 * @author acoppes
 */
public class NativeNet implements Net {

//    NetJavaImpl netJavaImpl;

    public NativeNet(NativeApplicationConfiguration configuration) {
//        netJavaImpl = new NetJavaImpl(configuration.maxNetThreads);
    }

    @Override
    public void sendHttpRequest(HttpRequest httpRequest, HttpResponseListener httpResponseListener) {
//        netJavaImpl.sendHttpRequest(httpRequest, httpResponseListener);
    }

    @Override
    public void cancelHttpRequest(HttpRequest httpRequest) {
//        netJavaImpl.cancelHttpRequest(httpRequest);
    }

    @Override
    public boolean isHttpRequestPending(HttpRequest httpRequest) {
//        return netJavaImpl.isHttpRequestPending(httpRequest);
        return false;
    }

    @Override
    public ServerSocket newServerSocket(Protocol protocol, String ipAddress, int port, ServerSocketHints hints) {
//        return new NetJavaServerSocketImpl(protocol, ipAddress, port, hints);
        throw new GdxRuntimeException("Not implemented yet");
    }

    @Override
    public ServerSocket newServerSocket(Protocol protocol, int port, ServerSocketHints hints) {
//        return new NetJavaServerSocketImpl(protocol, port, hints);
        throw new GdxRuntimeException("Not implemented yet");
    }

    @Override
    public Socket newClientSocket(Protocol protocol, String host, int port, SocketHints hints) {
//        return new NetJavaSocketImpl(protocol, host, port, hints);
        throw new GdxRuntimeException("Not implemented yet");
    }

    @Override
    public boolean openURI(String uri) {
//        if (SharedLibraryLoader.os == Os.MacOsX) {
//            try {
//                (new ProcessBuilder("open", (new URI(uri).toString()))).start();
//                return true;
//            } catch (Throwable t) {
//                return false;
//            }
//        } else if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
//            try {
//                Desktop.getDesktop().browse(new URI(uri));
//                return true;
//            } catch (Throwable t) {
//                return false;
//            }
//        } else if (SharedLibraryLoader.os == Os.Linux) {
//            try {
//                (new ProcessBuilder("xdg-open", (new URI(uri).toString()))).start();
//                return true;
//            } catch (Throwable t) {
//                return false;
//            }
//        }
        return false;
    }
}
