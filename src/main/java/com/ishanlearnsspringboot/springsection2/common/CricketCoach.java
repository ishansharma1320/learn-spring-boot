package com.ishanlearnsspringboot.springsection2.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 10 laps of the ground !!!!!";
    }
}
