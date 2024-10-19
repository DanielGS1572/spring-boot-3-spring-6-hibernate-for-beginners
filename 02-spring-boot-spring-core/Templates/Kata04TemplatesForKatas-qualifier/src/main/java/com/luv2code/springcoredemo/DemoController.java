package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    Coach coach;
    @Autowired
    public DemoController(@Qualifier("coachExample") Coach coach ){
        System.out.println("DEMO CONTROLLER");
        this.coach = coach;
    }
    @GetMapping("/getwork")
    public String mapping(){
        return this.coach.getWork();
    }
    @GetMapping("/destroy")
    public void destroy(){
        System.exit(0);
    }
}
