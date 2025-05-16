package com.example.Spring.Annotations.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

    private Sim sim; // here we hava 2 beans with jio & Airtel. Cnflict occur and throws UnsatisfiedDependencyException
    //use Qualifier annotation
    @Autowired
    //@Qualifier("Jio")  this can be used for field Injection
    public Mobile(@Qualifier("airtel") Sim sim) {
        this.sim = sim;
    }

    public void show() {
        sim.calling();
        sim.data();
    }



}
