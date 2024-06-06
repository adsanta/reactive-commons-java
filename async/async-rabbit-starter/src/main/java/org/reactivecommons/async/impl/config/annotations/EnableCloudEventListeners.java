package org.reactivecommons.async.impl.config.annotations;

import org.reactivecommons.async.rabbit.config.CloudEventListenersConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(CloudEventListenersConfig.class)
@Configuration
public @interface EnableCloudEventListeners {
}



