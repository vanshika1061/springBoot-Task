package com.example.springboot.project0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Welcome Here Everyone!!!! " ;
	}

}
