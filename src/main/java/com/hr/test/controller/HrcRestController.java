package com.hr.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HrcRestController {

	@GetMapping("/")
	public String sayHello()
	{
		return "Hello Jenkins with spring boot application";
		
	}
}
