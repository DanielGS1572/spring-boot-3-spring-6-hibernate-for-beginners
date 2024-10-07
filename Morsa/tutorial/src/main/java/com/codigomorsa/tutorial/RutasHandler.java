package com.codigomorsa.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice   //es un mapeador de excepciones, aca se hace un filtrado de que excepciónes podrá ver el cliente
public class RutasHandler {
    private /*static*/ Logger logger = LoggerFactory.getLogger(RutasHandler.class);


    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleNullPointer(NullPointerException exception){            //se puede poner como parametro la clase de la excepción para cachar el mensaje si así se requiere
        logger.error(exception.getMessage());           //como buena practica loggear el error
        return "Internal error. Contact support";
    }
}
