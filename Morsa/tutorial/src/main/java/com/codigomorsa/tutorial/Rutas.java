package com.codigomorsa.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Restcontroller es una anotación con la que se definen rutas
public class Rutas {
    @GetMapping("/")
    String miPrimeraRuta(){
        return "Hola Mundo";
    }
}
