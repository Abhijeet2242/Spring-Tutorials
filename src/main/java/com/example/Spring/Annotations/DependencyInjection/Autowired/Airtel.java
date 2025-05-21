package com.example.Spring.Annotations.DependencyInjection.Autowired;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{
    private Sim sim;

    @Override
    public void calling() {
        System.out.println("calling from Airtel sim");
    }

    @Override
    public void data() {
        System.out.println("this is airtel data");
    }
}
