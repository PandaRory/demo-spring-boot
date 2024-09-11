package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class GracefulShutdownListener implements ApplicationListener<ContextClosedEvent> {
    private static final Logger logger = LoggerFactory.getLogger(GracefulShutdownListener.class);

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        logger.info("SIGTERM received in application shutdown event");
        SleepTimer.start(2000);
        logger.info("Processed SIGTERM in application shutdown event");
    }
}