package com.example.Spring.Annotations.DependencyInjection.Autowired.ConditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "NOSQLConnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class NoSQLConnection {
    public NoSQLConnection() {
        System.out.println("NO SQL initialized");
    }
}
