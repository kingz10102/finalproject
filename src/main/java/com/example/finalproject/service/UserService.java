package com.example.finalproject.service;

import com.example.finalproject.models.User;
public interface UserService {
//return an array of users
    public Iterable<User> listUsers();
    public User createUser(User user);

}
