package com.luv2code.springcoredemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringcoredemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcoredemoApplication.class, args);
    }
@Bean
    public CommandLineRunner commandLineRunner() {
        return runner -> {
            System.out.println("Hello world");
            throw new RuntimeException("ERROR");
        };
    }
}
