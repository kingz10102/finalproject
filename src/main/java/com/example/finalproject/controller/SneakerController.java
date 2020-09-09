package com.example.finalproject.controller;

import com.example.finalproject.models.Sneakers;

import com.example.finalproject.service.SneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sneakers")
public class SneakerController {

    @Autowired
    SneakerService sneakerService;

    @GetMapping
    public Iterable<Sneakers> findAll() {

        return sneakerService.listSneakers();
    }
    @GetMapping("/{title}")
    public Sneakers getSneakers(@PathVariable String title) {
        return sneakerService.getSneakers(title);
    }
    //to receive a specific post
    @PostMapping
    public Sneakers createSneakers(@RequestBody Sneakers newSneakers) {
        return sneakerService.createSneakers(newSneakers);

    }
}
