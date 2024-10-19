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
    Coach tenisCoach;
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach, @Qualifier("tenisCoach") Coach tenisCoach ){
        System.out.println("DEMO CONTROLLER");
        this.coach = coach;
        this.tenisCoach = tenisCoach;
    }
    @GetMapping("/getwork")
    public String mapping(){
        return this.coach.getWork() + " - " + this.tenisCoach.getWork();
    }
}
