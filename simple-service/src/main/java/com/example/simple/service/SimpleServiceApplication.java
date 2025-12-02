package com.example.simple.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SimpleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleServiceApplication.class, args);
	}

}
