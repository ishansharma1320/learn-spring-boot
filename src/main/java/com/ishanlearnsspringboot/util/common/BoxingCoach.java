package com.ishanlearnsspringboot.util.common;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spar with training partner";
    }
}
