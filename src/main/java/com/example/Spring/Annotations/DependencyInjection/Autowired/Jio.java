package com.example.Spring.Annotations.DependencyInjection.Autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  // using this annotation we dont need to setup @Qualifier . it will inject this bean as the primary
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
