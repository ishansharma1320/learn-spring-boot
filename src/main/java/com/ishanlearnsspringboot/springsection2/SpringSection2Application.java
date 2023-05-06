package com.ishanlearnsspringboot.springsection2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Need to add the default base package also for successful execution
@SpringBootApplication(scanBasePackages = {"com.ishanlearnsspringboot.springsection2","com.ishanlearnsspringboot.util"})
public class SpringSection2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSection2Application.class, args);
	}

}
