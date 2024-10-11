package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

//Si se hace set, aún así lo cargará (se hara el print de track coach)
/*
    @Autowired
    public void setTrackCoach(@Qualifier("trackCoach") Coach theCoach){
        myCoach = theCoach;
    }
*/
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/trackcoach")
    public String getCoachWorkout() {
        return myCoach.getDailyWorkout();
    }
}






