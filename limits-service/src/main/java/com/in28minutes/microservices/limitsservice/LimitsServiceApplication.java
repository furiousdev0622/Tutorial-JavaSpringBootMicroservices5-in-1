package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.in28minutes.microservices.limitsservice.configuration")
public class LimitsServiceApplication {

    public static void main(String[] args) {
	SpringApplication.run(LimitsServiceApplication.class, args);
    }

}
