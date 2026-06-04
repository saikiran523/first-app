package com.codewithsai.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }
}

@RestController
class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello GitHub! My Spring Boot App is Running.";
    }
}