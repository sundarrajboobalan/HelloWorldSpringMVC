package com.example.HelloworldMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldMvcApplication.class, args);
	}
	
	@RestController
	class HelloworldRestController{
		@GetMapping("hello")
		String hello() {
			return "HelloWorld";
		}
		
	}
}

