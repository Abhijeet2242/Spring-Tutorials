package com.example.Spring.model;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ErrorResponse {
    private Date timeStamp;
    private int status;
    private String message;

    public ErrorResponse(Date timeStamp, int status, String message) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
