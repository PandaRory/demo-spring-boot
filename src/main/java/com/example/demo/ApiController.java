package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping(value = "/api/v1/profile")
    public String getProfile() {
        SleepTimer.start(30000);
        return "Response OK";
    }
}
