package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @GetMapping(value = "/api/v1/profile")
    public ResponseEntity<String> getProfile() {
        logger.info("Request - get profile");
        SleepTimer.start(30000);
        logger.info("Response - get profile");
        return new ResponseEntity<String>("Response OK", HttpStatus.OK);
    }
}
