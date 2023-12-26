package com.example.shivamFirst4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.shivamFirst4.service.hollywoodInterfa;

@Controller
@RequestMapping("/hollywood")
@ResponseBody
public class hollywoodController {
	
	@Autowired
	hollywoodInterfa blf;
	
	@GetMapping("/upcoming_new")
	public void upcoming_new()
	{
		System.out.println("Showing data of upcoming movies......");
		blf.upcoming();
	}
	
	@GetMapping("/current_trending")
	public void current_trending()
	{
		System.out.println("Showing data of current trending movies......");
		blf.trending();
	}
}
