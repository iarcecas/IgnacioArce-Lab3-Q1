package com.example.demo;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IgnacioArceLab3Q1ApplicationTests {

	public static void main(String[] args) {
	
		SpringApplication.run(IgnacioArceLab3Q1Application.class, args);
	}
	
	@GetMapping("/get")
	public String getMessage() {
        LocalTime currentTime = LocalTime.now();
        String message;
        if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
            message = "Good morning Ignacio! Welcome to COMP367";
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(17, 0))) {
            message = "Good afternoon Ignacio! Welcome to COMP367";
        } else {
            message = "Good evening Ignacio! Welcome to COMP367";
        }
        
        return message;
	}

}
