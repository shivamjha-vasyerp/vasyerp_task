package com.example.shivamFirst5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.shivamFirst5.service.pcInformationInter;

@Controller
@RequestMapping("/pcinfo")
@ResponseBody
public class PcInfoController {

	@Autowired
	pcInformationInter pc;
	
	@GetMapping("/ipaddress")
	public String getIP()
	{
		System.out.println("Fetching your ip address....");
		pc.getIP();
		return "Fetching your ip address";
	}
	
	@GetMapping("/detailedinfo")
	public String all_ifo()
	{
		System.out.println("Fetching your whole data.....");
		pc.getDetailedView();
		return "Fetching your pc detailed data";
	}
}
