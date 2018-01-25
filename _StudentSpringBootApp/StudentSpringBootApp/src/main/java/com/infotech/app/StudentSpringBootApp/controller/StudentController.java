package com.infotech.app.StudentSpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping(value = "/")
	public String helloWorld() {
		return "hello world!!!";
	}
}
