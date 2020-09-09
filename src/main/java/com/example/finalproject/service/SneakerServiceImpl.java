package com.example.finalproject.service;

import com.example.finalproject.models.Sneakers;
import com.example.finalproject.repositories.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SneakerServiceImpl implements SneakerService {
    @Autowired
    private SneakerRepository sneakerRepository;

    @Override
    public Iterable<Sneakers> listSneakers() {

        return sneakerRepository.findAll();
    }

    @Override
    public Sneakers createSneakers(Sneakers sneakers) {

        return sneakerRepository.save(sneakers);
    }

    @Override
    public Sneakers getSneakers(String title) {
        return sneakerRepository.findBytitle(title);
    }

}
