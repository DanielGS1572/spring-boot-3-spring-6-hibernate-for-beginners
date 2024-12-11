package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Tennis implements Coach{

    @Override
    public String getWork() {
        return "Tennis Coach";
    }

    public Tennis(){
        System.out.println(getClass().getSimpleName());
    }
}
