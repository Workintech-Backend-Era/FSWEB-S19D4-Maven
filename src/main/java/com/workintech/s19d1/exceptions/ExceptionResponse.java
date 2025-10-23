package com.workintech.s19d1.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {

    private String message;
    private int httpStatus;
    private LocalDateTime time;

    public ExceptionResponse(String message,int httpStatus, LocalDateTime time){
        this.message = message;
        this.httpStatus=httpStatus;
        this.time=time;
    }

}
