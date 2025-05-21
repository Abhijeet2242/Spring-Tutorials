package com.example.Spring.Annotations.ContextConfiguration.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataSource implements DataSource{

    @Override
    public void connect() {
        System.out.println("Connected by dev");
    }
}
