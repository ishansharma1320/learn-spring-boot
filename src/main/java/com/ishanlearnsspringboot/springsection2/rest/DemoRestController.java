package com.ishanlearnsspringboot.springsection2.rest;

import com.ishanlearnsspringboot.util.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    private Coach myCoach;
    @Autowired
    private void  setCoach(@Qualifier("boxingCoach") Coach coach){
        this.myCoach = coach;
    }

    @GetMapping("/getDailyWorkout")
    private String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
