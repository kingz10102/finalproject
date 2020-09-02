package com.example.finalproject.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//
    @Column(unique = true)
    private String username;

    @Column
    private String password;

    public User() {}
//getters
    public Long getId() {
        return id;
    }
//setters
    public void setId(Long id) {
        this.id = id;
    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
