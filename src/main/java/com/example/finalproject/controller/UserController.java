package com.example.finalproject.controller;

import com.example.finalproject.models.User;

import com.example.finalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Iterable<User> findAll() {
        return userService.listUsers();
    }

    //to receive a specific post
    @PostMapping
    public User createUser(@RequestBody User userParam) {
        return userService.createUser(userParam);

    }
}
