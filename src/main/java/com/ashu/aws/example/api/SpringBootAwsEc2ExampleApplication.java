package com.ashu.aws.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsEc2ExampleApplication {

	
	@GetMapping("/")
	public String home() {
		return "Welcome to apring boot app deployment";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsEc2ExampleApplication.class, args);
	}

}
