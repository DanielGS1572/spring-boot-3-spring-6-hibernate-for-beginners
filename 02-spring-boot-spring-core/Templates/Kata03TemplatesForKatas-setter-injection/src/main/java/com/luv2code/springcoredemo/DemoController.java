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
    public DemoController(@Qualifier("tenisCoach") Coach coach){
        System.out.println("DemoController");
        this.coach = coach;
    }
    @GetMapping("/getwork")
    public String getwork(){
        return this.coach.getWorkout();
    }
}
