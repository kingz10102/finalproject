package com.example.finalproject.service;

import com.example.finalproject.models.Sneakers;
public interface SneakerService {
    //return an array of users
    public Iterable<Sneakers> listSneakers();

    public Sneakers createSneakers(Sneakers newSneakers);

    public Sneakers getSneakers(String title);



}
