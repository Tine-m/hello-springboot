package com.example.hellospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public String greeting() {
        return ("Hello to Docker from SpringBoot");
    }
}
