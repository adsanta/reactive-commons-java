package org.reactivecommons.async.api.handlers.registered;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.reactivecommons.async.api.handlers.CloudEventHandler;

@RequiredArgsConstructor
@Getter
public class RegisteredCloudEventHandler {
    private final String path;
    private final CloudEventHandler handler;
}
