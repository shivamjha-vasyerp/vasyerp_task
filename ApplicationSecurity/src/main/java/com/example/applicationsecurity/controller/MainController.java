package com.example.applicationsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/index")
	public String index()
	{
		return "index"; 
	}
	
	@GetMapping("/signin")
	public String login()
	{
		return "login"; 
	}
	
	@GetMapping("/userlogout")
	public String logout()
	{
		return "login"; 
	}
	
	
	
}