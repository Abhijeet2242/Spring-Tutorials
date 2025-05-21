package com.example.Spring.Annotations.ContextConfiguration.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {
    @Bean
    public Property property() {
        return new Property();
    }
}
