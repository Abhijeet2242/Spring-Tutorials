package com.example.Spring.Annotations.DependencyInjection.Autowired.Scope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//this same component using for session controller scope example
@Component
public class Student {

//    @Autowired
//    User user;

    public Student() {
        System.out.println("Student inituialized");
    }

    @PostConstruct
    public void init() {
        System.out.println("Student hashcode : " + this.hashCode());
        //System.out.println("User hash from student : " + user.hashCode());
    }
}
