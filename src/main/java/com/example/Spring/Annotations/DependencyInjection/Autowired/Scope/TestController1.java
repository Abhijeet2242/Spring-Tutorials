//package com.example.Spring.Annotations.DependencyInjection.Autowired.Scope;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Scope("prototype")
//@RequestMapping("/api")
//public class TestController1 {
//
//    @Autowired
//    User user;
//
//    public TestController1() {
//      System.out.println("Test Controller initialized");
//    }
//
//    @PostConstruct
//    public void address() {
//        System.out.println("hashcode of TestController 1 : " + this.hashCode() + " " + "User : " + user.hashCode());
//    }
//
//    @GetMapping("/TestController1")
//    public ResponseEntity<String> getData() {
//        System.out.println("api invoked");
//        return ResponseEntity.status(200).body("api called successfully");
//    }
//}
