package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
public class DemoController {
    Coach coach;
    @Autowired
    public DemoController(Coach coach){
        System.out.println("Constructor: " + getClass().getSimpleName());
        this.coach = coach;
    }
    @GetMapping("/workout")
    public String getWorkout(){
        return this.coach.getWorkout();
    }
}
