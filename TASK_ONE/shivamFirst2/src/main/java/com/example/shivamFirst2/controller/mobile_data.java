package com.example.shivamFirst2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.shivamFirst2.service.gettingIphoneInter;

@Controller
@RequestMapping("/iphone")
@ResponseBody
public class mobile_data {
	@Autowired
	gettingIphoneInter iphone;

	@GetMapping("/current_model")
	public void get_Current_Model()
	{
		iphone.getCurrentModel();
		System.out.println("Getting current model");
	}
	
	@GetMapping("/all_models")
	public void get_all_models()
	{
		iphone.getAllModel();
		System.out.println("Getting all models");
	}
}
