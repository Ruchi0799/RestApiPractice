package com.springrestpractice.springrestpractice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		System.out.println("Hello!");
		return "Welcome to courses application";

}
}
