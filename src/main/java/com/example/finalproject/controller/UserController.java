package com.example.finalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World: Kevin";
    }

}
