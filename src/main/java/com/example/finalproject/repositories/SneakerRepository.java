package com.example.finalproject.repositories;

import com.example.finalproject.models.Sneakers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


//user type has a data type of Long
    public interface SneakerRepository extends CrudRepository<Sneakers, Long> {
        @Query("From Sneakers s Where s.title = ?1")
    public Sneakers findBytitle( String title);
}
