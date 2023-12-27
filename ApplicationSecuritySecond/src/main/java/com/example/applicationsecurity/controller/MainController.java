package com.example.applicationsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/signin")
	public String login()
	{
		return "login";
	}
}
