package com.example.finalproject.service;

import com.example.finalproject.models.Socks;

public interface SockService {
    //return an array of users
    public Iterable<Socks> listSocks();

    public Socks createSocks(Socks newSocks);




}