package com.ishanlearnsspringboot.springsection2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    private Coach myCoach;
    @Autowired
    DemoRestController(Coach myCoach){
        this.myCoach = myCoach;
    }

    @GetMapping("/getDailyWorkout")
    private String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
