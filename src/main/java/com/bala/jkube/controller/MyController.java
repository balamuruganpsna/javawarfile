package com.bala.jkube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(value="/hello")
	public String helloWorld()
	{
		return "Hellow world to Mr. balamurugan";
	}

}
