package com.example.Spring.Annotations.DependencyInjection.Autowired.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Book {
    public Book() {
        System.out.println("this book is : " + this);
    }
}
