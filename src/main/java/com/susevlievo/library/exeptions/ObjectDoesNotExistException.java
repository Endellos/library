package com.susevlievo.library.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Object dosen't exist", code=HttpStatus.NOT_FOUND)
public class ObjectDoesNotExistException extends RuntimeException{
    public ObjectDoesNotExistException(String message){
        super(message);
    }
}
