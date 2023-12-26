package com.example.shivamFirst3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.shivamFirst3.service.gettingLaptopInter;

@Controller
@RequestMapping("/laptop")
@ResponseBody
public class laptop_data {
	@Autowired
	gettingLaptopInter laptop;

	@GetMapping("/current_model")
	public void get_Current_Model()
	{
		laptop.getCurrentModel();
		System.out.println("Getting current model");
	}
	
	@GetMapping("/all_models")
	public void get_all_models()
	{
		laptop.getAllModel();
		System.out.println("Getting all models");
	}
}
