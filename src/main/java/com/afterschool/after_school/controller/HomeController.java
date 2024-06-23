package com.afterschool.after_school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afterschool.after_school.services.Home;

@RestController
@RequestMapping("/api")
public class HomeController {

	@Autowired
	private Home homeService;
	
	@GetMapping
	public String getHome() {
		return homeService.getHome();
	}
}
