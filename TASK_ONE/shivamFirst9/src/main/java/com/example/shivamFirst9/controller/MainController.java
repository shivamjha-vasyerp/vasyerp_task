package com.example.shivamFirst9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.shivamFirst9.service.StudentDataInter;

@Controller
@RequestMapping("/home")
public class MainController {
	
	@Autowired
	private StudentDataInter s1;

	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView m1 = new ModelAndView();
		m1.setViewName("index");
		m1.addObject("data",s1.getAllData());
		return m1;
	}
}
