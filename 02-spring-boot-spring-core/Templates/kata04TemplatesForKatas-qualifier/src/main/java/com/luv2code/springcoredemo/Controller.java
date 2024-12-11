package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Coach coach;
    @Autowired
    public Controller(Coach coach){
        System.out.println(getClass().getSimpleName());
        this.coach = coach;
    }
    @GetMapping("/work")
    public String getWork(){
        return coach.getWork();
    }
}
