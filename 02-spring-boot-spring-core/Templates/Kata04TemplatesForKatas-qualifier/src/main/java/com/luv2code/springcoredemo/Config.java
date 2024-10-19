package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Coach coachExample(){
        return new CricketCoach();
    }
}
