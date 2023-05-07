package com.ishanlearnsspringboot.util.common;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach{

    BoxingCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spar with training partner";
    }
}
