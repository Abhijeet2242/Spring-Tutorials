package com.example.Spring.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserService1 {

    @Async
    public void service() {
        System.out.println("This service method runs via : " + Thread.currentThread().getName());
    }
}
