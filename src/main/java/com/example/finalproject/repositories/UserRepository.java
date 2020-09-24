package com.example.finalproject.repositories;

import com.example.finalproject.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

//user type has a data type of Long
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("FROM User u WHERE u.username = ?1 and u.password = ?2")
    public User login(String username, String password);
}


