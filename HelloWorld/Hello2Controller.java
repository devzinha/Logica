package com.helloWorld.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Hello2")

public class Hello2Controller {
	
	@GetMapping
	public String hello() {
		return "Conseguir fixar todos os conhecimentos de Spring";
	}

}
