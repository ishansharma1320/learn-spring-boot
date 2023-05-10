package com.ishan.learns.springboot.section4.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {

    @GetMapping("/hello")
    private String getHelloMessage(){
        return "Hello World";
    }

}
