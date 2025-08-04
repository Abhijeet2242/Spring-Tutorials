package com.example.Spring.Controller;

import com.example.Spring.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService1 userService1;
    @GetMapping("/getUser")
    public String getUserServiceDetails() {
        System.out.println("getting user via : " + Thread.currentThread().getName());
        userService1.service();
        return null;
    }
}
