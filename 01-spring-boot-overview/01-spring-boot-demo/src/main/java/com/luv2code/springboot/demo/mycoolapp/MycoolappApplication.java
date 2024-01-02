package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication		//Se requiere de esta anotación para que arranque
public class MycoolappApplication {
//Para cambiar el puerto de la aplicación modificar resources > application.properties
	//server.port=8000

	public static void main(String[] args) {
		//bootstrap de spring boot app (es la entrada de la ejecución)
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
