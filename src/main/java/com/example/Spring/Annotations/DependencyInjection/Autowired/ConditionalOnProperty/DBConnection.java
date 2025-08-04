package com.example.Spring.Annotations.DependencyInjection.Autowired.ConditionalOnProperty;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
//@Component
public class DBConnection {

    @Autowired(required = false)
    MySQLConnection mySQLConnection;

    @Autowired(required = false)
    NoSQLConnection noSQLConnection;

    public DBConnection() {
        System.out.println("DB COnnection is initialized");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean created...");
        System.out.println("SQL bean is null : " + Objects.isNull(mySQLConnection));
        System.out.println("NO-SQL bean is null : " + Objects.isNull(noSQLConnection));
    }
 }
