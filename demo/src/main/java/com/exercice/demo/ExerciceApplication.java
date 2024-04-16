package com.exercice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ExerciceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ExerciceApplication.class, args);

	}

	@GetMapping("hello-world")
	public String helloWorld()
	{
		return "Hello world";
	}
	

}
