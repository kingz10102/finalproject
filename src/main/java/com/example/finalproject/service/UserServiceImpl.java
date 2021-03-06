package com.example.finalproject.service;

import com.example.finalproject.models.User;
import com.example.finalproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> listUsers() {

        return userRepository.findAll();
    }

    @Override
    public User createUser(User newUser) {

        return userRepository.save(newUser);
    }

    @Override
    public User login(String username, String password) {

        return userRepository.login(username, password);
    }
}
