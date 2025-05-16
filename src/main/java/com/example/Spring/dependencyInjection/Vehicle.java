package com.example.Spring.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

interface IEngine{
    String importEngine();
    double price();
}

class Toyota implements IEngine{
    @Override
    public String importEngine() {
        return "made in india";
    }

    @Override
    public double price() {
        return 350000;
    }
}


public class Vehicle {
    private IEngine iEngine;

    //constructor
//    public Vehicle(IEngine iEngine){
//        this.iEngine = iEngine;
//    }

    //now usaing setter method
    @Autowired
    public void setEngine(IEngine iEngine) {
        this.iEngine = iEngine;
    }

    public void info() {
        System.out.println("Enfine : " + iEngine.importEngine() + " " + "price : " + iEngine.price());
    }
}
