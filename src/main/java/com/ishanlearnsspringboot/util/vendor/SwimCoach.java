package com.ishanlearnsspringboot.util.vendor;

import com.ishanlearnsspringboot.util.common.Coach;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim 1km daily";
    }
}
