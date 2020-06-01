package com.jefferson.validador.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptions extends RuntimeException{
    public ResourceNotFoundExceptions(String message) {
        super(message);
    }

}
