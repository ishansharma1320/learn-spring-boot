package com.ishanlearnsspringboot.util.config;

import com.ishanlearnsspringboot.util.common.Coach;
import com.ishanlearnsspringboot.util.vendor.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {


    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
