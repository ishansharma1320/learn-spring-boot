package com.ishanlearnsspringboot.util.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run 10 laps of the ground !!!!!";
    }
}
