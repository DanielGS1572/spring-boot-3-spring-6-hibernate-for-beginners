package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("Constructor : CRICKET COACH");
    }

    @Override
    public String getWork() {
        return "Cricket coach";
    }
}
