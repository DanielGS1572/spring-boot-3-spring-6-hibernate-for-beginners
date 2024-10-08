package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
		scanBasePackages = {"com.luv2code.springcoredemo",
							"com.luv2code.util"})
=> Ver que si se indica que haga escaneo de paquetes, se tiene que incluir
el que esta al mismo nivel que main [Validar]
=> Ver que se puede poner más especifico (a nivel clase y no paquete)
*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
