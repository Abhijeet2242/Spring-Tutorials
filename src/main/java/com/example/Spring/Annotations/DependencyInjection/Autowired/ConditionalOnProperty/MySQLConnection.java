package com.example.Spring.Annotations.DependencyInjection.Autowired.ConditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

//@Component
//@ConditionalOnProperty(prefix = "MYSQLConnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MySQLConnection {
    public MySQLConnection() {
        System.out.println("MY SQL initialized");
    }
}
