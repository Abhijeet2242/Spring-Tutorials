package com.example.Spring.Annotations.DependencyInjection.Autowired.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
public class BeanConfig {

    @Bean
    public MyService serve() {
        return new MyService();
    }
}
