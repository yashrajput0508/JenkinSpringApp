package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {
	
	@GetMapping("/hello")
	public String getHelloWorld() {
		return "Hello World";
	}
}
