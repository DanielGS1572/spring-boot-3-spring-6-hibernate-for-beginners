package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Baseball implements Coach{
    @Override
    public String getWork() {
        return "baseball coach";
    }
    public Baseball(){
        System.out.println(getClass().getSimpleName());
    }
}
