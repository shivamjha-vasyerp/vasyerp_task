package com.example.demosecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demosecurity.model.userdata.UserData;
import com.example.demosecurity.service.userservice.UserInter;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	private UserInter userInter;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {

		return "login";
	}

	@GetMapping("/invalid")
	public String invalid() {
		return "error";
	}

	@GetMapping("/user/profile")
	public String profile() {
		return "error";
	}

	@GetMapping("/user/home")
	public String home() {
		return "home";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/saveUser")
	public String saveData(@ModelAttribute UserData userData,HttpSession session) {
		UserData user = userInter.userSave(userData);
		if (ObjectUtils.isEmpty(user)) {
			session.setAttribute("msg", "Registered succesfully");
		} else {
			session.setAttribute("msg", "Not registered");
		}
		return "redirect:/register";
	}
}
