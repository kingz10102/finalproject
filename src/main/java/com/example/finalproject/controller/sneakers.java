package com.example.finalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sneakers")
public class sneakers {
    @GetMapping

    public String basketball() {
        return "basketball";
    }
}
