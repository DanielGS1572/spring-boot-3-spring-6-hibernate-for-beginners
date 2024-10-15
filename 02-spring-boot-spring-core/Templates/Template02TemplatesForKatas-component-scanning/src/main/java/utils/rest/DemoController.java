package utils.rest;

import utils.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    Coach coach;
    @Autowired
    public DemoController(Coach coach){
        this.coach = coach;
    }
    @GetMapping("/workout")
    public String getWorkout(){
        return this.coach.getWorkout();
    }
}
