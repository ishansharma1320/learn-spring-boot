package com.ishanlearnsspringboot.springsection2.rest;

import com.ishanlearnsspringboot.util.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    private Coach myCoach;

    public DemoRestController(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    private void doSomeStartupStuff(){
        System.out.println("PostConstruct: " + getClass().getSimpleName());
    }

    @PreDestroy
    private void doSomeDestroyStuff(){
        System.out.println("PreDestroy: " + getClass().getSimpleName());
    }
    @Autowired
    private void  setCoach(@Qualifier("swimCoach") Coach coach){
        this.myCoach = coach;
    }

    @GetMapping("/getDailyWorkout")
    private String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
