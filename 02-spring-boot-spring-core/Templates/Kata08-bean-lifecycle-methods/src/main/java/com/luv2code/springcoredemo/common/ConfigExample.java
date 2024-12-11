package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigExample {
    @Bean
    public Coach mySuperBean(){
        return new BaseballCoach();
    }
}
