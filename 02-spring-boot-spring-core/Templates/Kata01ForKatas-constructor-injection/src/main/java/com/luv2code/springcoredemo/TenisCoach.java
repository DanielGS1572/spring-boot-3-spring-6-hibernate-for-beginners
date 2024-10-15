package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class TenisCoach implements Coach{

    public TenisCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Tenis Coach";
    }
}
