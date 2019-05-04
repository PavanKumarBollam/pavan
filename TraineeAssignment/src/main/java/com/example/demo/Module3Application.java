package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.controller")
@ComponentScan("com.example.dao")
@ComponentScan("com.example.model")
@ComponentScan("com.example.service")
@EntityScan(basePackages= {"com.example.model"})
@SpringBootApplication
public class Module3Application {

	public static void main(String[] args) {
		SpringApplication.run(Module3Application.class, args);
	}

}
