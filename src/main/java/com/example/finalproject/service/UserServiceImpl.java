package com.example.finalproject.service;

import com.example.finalproject.models.User;
import com.example.finalproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return null;
    }

//to receive a specific post
    @PostMapping
    public User createUser() {

    }

}
