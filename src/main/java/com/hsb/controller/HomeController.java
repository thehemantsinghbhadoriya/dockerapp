package com.hsb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/display")
	public String getData() {

		return "Publish app successfully in AWS";
	}

}
