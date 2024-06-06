package org.reactivecommons.async.commons;

import io.cloudevents.CloudEvent;
import org.reactivecommons.async.api.handlers.CloudEventHandler;
import org.reactivecommons.async.commons.communications.Message;
import reactor.core.publisher.Mono;

import java.util.function.Function;

public class CloudEventExecutor {
    private final CloudEventHandler eventHandler;
    private final Function<Message, CloudEvent> converter;

    public CloudEventExecutor(CloudEventHandler eventHandler, Function<Message, CloudEvent> converter) {
        this.eventHandler = eventHandler;
        this.converter = converter;
    }

    public Mono<Void> execute(Message rawMessage) {
        return eventHandler.handle(converter.apply(rawMessage));
    }
}
