package com.example.Spring.model;

import org.springframework.http.HttpStatus;

public class CustomException extends Exception{
    HttpStatus status;
    String message;

    public CustomException(HttpStatus status, String message) {
        //super(message);
        this.status = status;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
