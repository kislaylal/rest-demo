package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnerController {

	@GetMapping("/")
	public String sayHi() {
		 
		String ret =  "Hello World 123";
		System.out.println("Returned Value = "+ ret);
		return ret;
	}
}