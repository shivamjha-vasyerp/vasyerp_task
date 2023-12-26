package com.example.shivamFirst6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
@ResponseBody
public class MainController {

	@GetMapping("/")
	public ModelAndView index()
	{
		ModelAndView m1 = new ModelAndView();
		m1.setViewName("home");
		m1.addObject("name", "Shivam jha");
		return m1;
	}
}
