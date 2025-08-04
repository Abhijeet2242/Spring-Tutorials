package com.example.Spring.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    public String name;
    public int id;
    User() {
        this.id = 101;
        this.name = "Abhijeet";
    }

    public User getUser() {
        return new User();
    }
}
