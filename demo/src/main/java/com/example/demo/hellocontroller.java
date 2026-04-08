package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @GetMapping("/api")
    public String sayHello() {
        return "Hello Java Spring boot is working";
    }
}