package com.example.studentApp.exception;

import jdk.jshell.Snippet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.View;

@ControllerAdvice
public class GlobalExceptionHandler {
    private final View error;

    public GlobalExceptionHandler(View error) {
        this.error = error;
    }

    @ExceptionHandler(StudentAlreadyExistsException.class)
    public ResponseEntity<String> handleStudendExist(StudentAlreadyExistsException ex){
          return new ResponseEntity< >(ex.getMessage(), HttpStatus.CONFLICT);
    }
}
