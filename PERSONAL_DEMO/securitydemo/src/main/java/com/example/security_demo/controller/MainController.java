package com.example.security_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class MainController {

	@GetMapping("/")
	public ModelAndView index()
	{
		ModelAndView m1 = new ModelAndView();
		m1.setViewName("index");
		return m1; 
	}
	
	@GetMapping("/home")
	public ModelAndView home()
	{
		ModelAndView m1 = new ModelAndView("home");
		return m1; 
	}
	
	@GetMapping("/about")
	public ModelAndView about()
	{
		ModelAndView m1 = new ModelAndView("about");
		return m1; 
	}
	
}
