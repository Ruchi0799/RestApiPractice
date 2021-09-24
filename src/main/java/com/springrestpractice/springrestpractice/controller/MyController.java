package com.springrestpractice.springrestpractice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrestpractice.springrestpractice.model.User;




@RestController
@RequestMapping("/helloController")
public class MyController {
	
//	@GetMapping("/home")
//	public String home() {
//		System.out.println("Hello!");
//		return "Welcome to courses application";
//
//}
	
	
	@RequestMapping(value= {"","/","/home"})
	public String sayHello() {
		return "Hello World!!";
	}
	
	@RequestMapping(value= {"/query"},method=RequestMethod.GET)
	public String sayHello(@RequestParam(value="name")String name) {
		return "Hello " +name+ "!";
	}
	
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello "+name+"!";
	}
	
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + "" +user.getLastName() +"!";
	}
	 
	
	
}
