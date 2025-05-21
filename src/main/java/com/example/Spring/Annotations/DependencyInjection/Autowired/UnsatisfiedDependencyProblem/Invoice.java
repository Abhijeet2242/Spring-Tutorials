//package com.example.Spring.Annotations.DependencyInjection.Autowired.UnsatisfiedDependencyProblem;
//
//import com.example.Spring.Annotations.DependencyInjection.Autowired.Bean.Order;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Invoice {
//
//
//    private Phone phone;
//
//    public Invoice(@Qualifier("android") Phone phone) {
//        this.phone = phone;
//        System.out.println("Invoice is initialized");
//    }
//
//    public void printPhone() {
//        phone.getPhone();
//    }
//
//}
