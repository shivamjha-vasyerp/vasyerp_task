package com.example.shivamFirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.shivamFirst.service.studentDataIn;

@Controller
@ResponseBody
@RequestMapping("/student_data")
public class student_details {
	
	@Autowired
	private studentDataIn std;
	
   
	@GetMapping("/name")
	public String getName() {
		std.disp_Name();
		return "Helo world";
	}
	
	@GetMapping("/details")
	public String getDetails()
	{
		std.disp_Details();
		return "Bye";
	}
}
