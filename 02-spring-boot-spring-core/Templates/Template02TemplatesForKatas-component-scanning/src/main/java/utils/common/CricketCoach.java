package utils.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getWorkout() {
        return "daily workout";
    }
}
