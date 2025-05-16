package com.example.Spring.Annotations.Autowired;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from jio Sim");
    }

    @Override
    public void data() {
        System.out.println("this is jio data");
    }
}
