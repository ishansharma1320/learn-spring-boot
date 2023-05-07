package com.ishanlearnsspringboot.util.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice 100 goal kicks";
    }
}
