package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloWorldServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldServiceApp.class, args);
    }
}