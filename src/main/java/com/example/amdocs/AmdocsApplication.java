package com.example.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AmdocsApplication {
	
	@GetMapping("/msg")
	public String show() {
		return "Hello World!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(AmdocsApplication.class, args);
	}

}
