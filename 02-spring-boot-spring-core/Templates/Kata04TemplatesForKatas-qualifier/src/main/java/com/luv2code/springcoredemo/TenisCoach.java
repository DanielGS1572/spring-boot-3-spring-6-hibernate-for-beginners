package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {

    public TenisCoach(){
        System.out.println("Constructor : TENIS Coach");
    }

    @Override
    public String getWork() {
        return "Tenis coach";
    }
}
