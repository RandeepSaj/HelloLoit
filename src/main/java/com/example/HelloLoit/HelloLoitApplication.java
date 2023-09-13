package com.example.HelloLoit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloLoitApplication {

	@GetMapping("/hello-world/welcome")

	public String helloAll(){

		return "Welcome to LOIT";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloLoitApplication.class, args);
	}

}
