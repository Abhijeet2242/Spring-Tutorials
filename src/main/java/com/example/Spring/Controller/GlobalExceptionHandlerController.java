package com.example.Spring.Controller;

import com.example.Spring.model.CustomException;
import com.example.Spring.model.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandlerController {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> handleGlobalCustomException(CustomException ex) {
        ErrorResponse response = new ErrorResponse(new Date(), ex.getStatus().value(), ex.getMessage());
        return  new ResponseEntity<>(response, ex.getStatus());
    }
}
