package com.example.Spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class AsyncConfig {
    @Bean("myThreadPoolTaskExecutor")
    public Executor taskExecutor() {
        int minSize = 2;
        int maxSize = 4;
        int qSize = 3;

        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(minSize);
        taskExecutor.setMaxPoolSize(maxSize);
        taskExecutor.setQueueCapacity(qSize);
        taskExecutor.setThreadNamePrefix("MyThread-");
        taskExecutor.initialize();
        return taskExecutor;
    }
}
