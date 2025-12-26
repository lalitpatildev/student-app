package com.example.studentApp.exception;

public class StudentAlreadyExistsException extends RuntimeException {
//Custom Exception Class
    public StudentAlreadyExistsException(String message){
             super(message);
    }
}
