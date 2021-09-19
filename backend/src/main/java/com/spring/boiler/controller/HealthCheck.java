package com.spring.boiler.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthCheck {
    @GetMapping(value="/healthCheck")
    public String healthStatus() {
        return "I am running Healthy!! What about you??";
    }
    
}
