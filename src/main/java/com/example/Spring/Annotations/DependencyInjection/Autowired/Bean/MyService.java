package com.example.Spring.Annotations.DependencyInjection.Autowired.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class MyService {
    @Value("${service.name}")
    private String serviceName;

    @Value("${service.version}")
    private String version;
    public void myService() {
        System.out.println("Service is running....!");
    }
    public void printService() {
        System.out.println("service name is : " + serviceName + " " + "version is : " + version);
    }
}
