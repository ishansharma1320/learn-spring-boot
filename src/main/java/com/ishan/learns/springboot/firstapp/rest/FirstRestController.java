package com.ishan.learns.springboot.firstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//To create a RestController, create a class
// inside the created class,
// add the RestController annotation and
// then expose an endpoint by adding the GetMapping annotation
// and define a method underneath it

@RestController
public class FirstRestController {

    @Value("${app.user.name}")
    private String username;
    // expose "/" endpoint
    @GetMapping("/")
    String saysHello(){
        return "Hello " + username;
    }
}
