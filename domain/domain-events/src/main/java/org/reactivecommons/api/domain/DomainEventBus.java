package org.reactivecommons.api.domain;

import io.cloudevents.CloudEvent;
import io.cloudevents.core.builder.CloudEventBuilder;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

public interface DomainEventBus {
    <T> Publisher<Void> emit(DomainEvent<T> event);

    Publisher<Void> emit(CloudEvent event);

    Publisher<Void> emit(CloudEventBuilder event);
}
