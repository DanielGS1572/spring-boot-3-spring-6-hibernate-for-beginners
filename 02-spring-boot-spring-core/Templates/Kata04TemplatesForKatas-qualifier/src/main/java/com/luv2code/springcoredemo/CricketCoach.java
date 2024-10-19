package com.luv2code.springcoredemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("Constructor : CRICKET COACH");
    }

    @Override
    public String getWork() {
        return "Cricket coach 3";
    }
}
