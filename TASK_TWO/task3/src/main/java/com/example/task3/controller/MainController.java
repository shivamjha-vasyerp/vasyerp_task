package com.example.task3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.example.task1.model.Student;
import com.example.task3.model.School;
import com.example.task3.service.SchoolInter;

@Controller
@RequestMapping("/school")
public class MainController {

	@Autowired
	SchoolInter schoolImple;

	@GetMapping("/")
	@ResponseBody
	public List<School> index() {
		return schoolImple.getAllData();
	}

	@PostMapping("/addData")
	@ResponseBody
	public School addData(@RequestBody School school) {
		return schoolImple.addData(school);
	}

	@DeleteMapping("/deleteData")
	@ResponseBody
	public ResponseEntity<String> deleteData(@RequestParam("id") Long id) {
		schoolImple.deleteData(id);
		return new ResponseEntity<>("Data deleted", HttpStatusCode.valueOf(200));
	}

	@PutMapping("/editData")
	@ResponseBody
	public School editData(@RequestBody School student) {
		return schoolImple.editData(student);
	}
}
