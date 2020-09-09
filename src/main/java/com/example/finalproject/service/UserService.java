package com.example.finalproject.service;

import com.example.finalproject.models.User;
public interface UserService {

    //return an array of users
    public Iterable<User> listUsers();

    //new user signup
    public User createUser(User newUser);

    //existing user login
    public User login(String username, String password);

}
