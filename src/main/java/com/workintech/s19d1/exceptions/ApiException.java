package com.workintech.s19d1.exceptions;


import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiException extends RuntimeException{

    private HttpStatus httpStatus;

    public ApiException(String message,HttpStatus status){
        super(message);
        this.httpStatus=status;
    }
}
