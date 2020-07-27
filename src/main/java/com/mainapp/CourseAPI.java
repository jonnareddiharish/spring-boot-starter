package com.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.controllers,com.service"})
@SpringBootApplication	
public class CourseAPI {
	
	
	public static void main(String[] args) {
		SpringApplication.run(CourseAPI.class, args);
	}
}
