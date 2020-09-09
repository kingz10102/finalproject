package com.example.finalproject.service;

import com.example.finalproject.models.Socks;
import com.example.finalproject.repositories.SockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SockServiceImpl implements SockService {
    @Autowired
    private SockRepository sockRepository;

    @Override
    public Iterable<Socks> listSocks() {

        return sockRepository.findAll();
    }

    @Override
    public Socks createSocks(Socks socks) {

        return sockRepository.save(socks);
    }


//
}
