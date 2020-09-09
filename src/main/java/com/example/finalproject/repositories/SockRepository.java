package com.example.finalproject.repositories;

import com.example.finalproject.models.Socks;

import org.springframework.data.repository.CrudRepository;


//user type has a data type of Long
public interface SockRepository extends CrudRepository<Socks, Long> { ;
}

