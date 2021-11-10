package com.example.StudentCrud.exception;

public class StudentAlreadyExistsException extends RuntimeException{
    public  StudentAlreadyExistsException(String msg){
        super(msg);
    }

}
