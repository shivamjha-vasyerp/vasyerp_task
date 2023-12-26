package com.example.shivamFirst8.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.shivamFirst8.dto.CarDto;
import com.example.shivamFirst8.model.UserRegister;
import com.example.shivamFirst8.service.CarService;

@Controller

public class MainController {

	@Autowired
	private CarService carService;

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView m1 = new ModelAndView();
		m1.setViewName("index");
		m1.addObject("car", carService.getAllData());
		return m1;
	}

	@PostMapping("/addData")
	public ModelAndView addData(@ModelAttribute("CarData") CarDto CarData, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("redirect:/");
		}
		System.out.println(CarData);
		carService.save(CarData);
		return new ModelAndView("redirect:/");
	}

	@GetMapping("/delete")
	public ModelAndView deleteData(@RequestParam("id") int id) {
		carService.delete(id);
		return new ModelAndView("redirect:/");
	}

	@GetMapping("/editData")
	public ModelAndView get(@RequestParam("id") int id) {

		ModelAndView m1 = new ModelAndView("edit");
		m1.addObject("data", carService.getData(id).get());
		return m1;
	}

	@GetMapping("/back")
	public ModelAndView back() {
		return new ModelAndView("redirect:/");
	}

	@GetMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}

	@PostMapping("/registerUser")
	public ModelAndView registerUser(@ModelAttribute("userRegister") UserRegister userRegister, HttpSession session) {
		System.out.println(userRegister);
		UserRegister  register = carService.registerUser(userRegister);
		if(register!=null)
		{
			session.setAttribute("msg", "Registered sucessfully");
		}
		else {
			session.setAttribute("msg", "Something wrong on server");
		}
		return new ModelAndView("redirect:/");
	}

}
