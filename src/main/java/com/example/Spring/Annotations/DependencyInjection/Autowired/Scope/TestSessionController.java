package com.example.Spring.Annotations.DependencyInjection.Autowired.Scope;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
@RequestMapping("/api/session")
public class TestSessionController {

    @Autowired
    Student student;

    public TestSessionController() {
        System.out.println("Session is initialized");
    }

    @PostConstruct
    public  void defaultMethod() {
        System.out.println("object of seession controller : " + this.hashCode());
        System.out.println("object of student in session : " + student.hashCode());
    }

    @GetMapping("/createSession")
    public ResponseEntity<String> createSession() {
        System.out.println("Session is created");
        return ResponseEntity.status(200).body("session is created with obj : " + this.hashCode());
    }

    @GetMapping("/destroySession")
    public ResponseEntity<String> destroySession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        System.out.println("session destroyed manually");
        return ResponseEntity.status(200).body("session destroyed successfully");
    }

}
