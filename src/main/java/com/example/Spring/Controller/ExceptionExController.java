package com.example.Spring.Controller;

import com.example.Spring.model.CustomException;
import com.example.Spring.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/")
public class ExceptionExController {
    @GetMapping("/get-User")
    public String getUser() throws CustomException {
        throw new CustomException(HttpStatus.BAD_REQUEST, "User Id missing");

        //here we didnt return response entity thats why it gives status code 500 and internal server error as it default
        //settings
    }

    @GetMapping("/get-user2")
    public ResponseEntity<?> getUser2() {
        try {
            throw new CustomException(HttpStatus.BAD_REQUEST, "User Id is missing");
        }catch (CustomException e) {
            ErrorResponse errorResponse = new ErrorResponse(new Date(), e.getStatus().value(), e.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatusCode.valueOf(e.getStatus().value()));
        }
    }

    //Controller level Exception handling.
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object> exceptionHandler(CustomException ex) {
        ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getStatus().value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, ex.getStatus());
    }
}
