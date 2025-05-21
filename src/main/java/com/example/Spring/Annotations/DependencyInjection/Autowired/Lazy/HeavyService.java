package com.example.Spring.Annotations.DependencyInjection.Autowired.Lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HeavyService {
    public HeavyService() {
        System.out.println("HeavyService bean initialized");
    }

    public void doSomething() {
        System.out.println("Doing something...");
    }
}
