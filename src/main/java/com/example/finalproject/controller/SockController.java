package com.example.finalproject.controller;

import com.example.finalproject.models.Socks;

import com.example.finalproject.service.SockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/socks")
public class SockController {

    @Autowired
    SockService sockService;

    @GetMapping
    public Iterable<Socks> findAll() {

        return sockService.listSocks();
    }
//    @GetMapping("/{title}")
//    public Socks getSocks(@PathVariable String title) {
//        return socksService.getSocks(title);
//    }
    //to receive a specific post
    @PostMapping
    public Socks createSocks(@RequestBody Socks newSocks) {
        return sockService.createSocks(newSocks);

    }
}

