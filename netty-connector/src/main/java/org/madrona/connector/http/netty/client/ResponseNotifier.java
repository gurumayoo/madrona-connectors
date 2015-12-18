package org.madrona.connector.http.netty.client;

import io.netty.handler.codec.http.HttpResponse;

public interface ResponseNotifier {

    void messageReceived(HttpResponse httpResponse);

    void networkErrorOccurred(Throwable throwable);
}
