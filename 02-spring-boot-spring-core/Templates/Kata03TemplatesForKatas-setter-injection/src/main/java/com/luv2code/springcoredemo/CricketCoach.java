package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("Cricket Coach");
    }

    @Override
    public String getWorkout() {
        return "Workout";
    }
}
