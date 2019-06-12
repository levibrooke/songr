package com.lab11.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    // route
    @GetMapping("/")
    public String getHelloWorld() {
        return "Hello, world!";
    }
}
