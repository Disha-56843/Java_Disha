package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {

	@RequestMapping("/")
	public String index() {
		// TODO Auto-generated method stub
		
		return "index";

	}
	
}
