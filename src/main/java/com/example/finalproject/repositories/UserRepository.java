package com.example.finalproject.repositories;

import com.example.finalproject.models.User;
import org.springframework.data.repository.CrudRepository;

//user type has a data type of Long
public interface UserRepository extends CrudRepository<User, Long> {
}
