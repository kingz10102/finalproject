package com.example.finalproject.controller;

import com.example.finalproject.models.User;

import com.example.finalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Iterable<User> findAll() {

        return userService.listUsers();
    }

    @GetMapping("/login/{username}/{password}")
    public User login(@PathVariable String username, @PathVariable String password) {
        return userService.login(username, password);
    }

    //to receive a specific post
    @PostMapping
    public User createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);

    }
}
