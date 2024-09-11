package com.example.demo;

import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

import static java.lang.Thread.sleep;

@SpringBootApplication
public class DemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			logger.info("SIGTERM received in shutdown hook");
			SleepTimer.start(5000);
			logger.info("Processed SIGTERM in shutdown hook");
        }));
	}

	@PreDestroy
	public void tearDown() {
		logger.info("tearDown start");
		SleepTimer.start(10000);
		logger.info("tearDown end");
	}
}