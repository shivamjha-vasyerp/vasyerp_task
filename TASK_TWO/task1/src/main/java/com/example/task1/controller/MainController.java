package com.example.task1.controller;

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

import com.example.task1.model.Student;
import com.example.task1.service.StudentInter;

@Controller
@RequestMapping("/student")
public class MainController {
	
	@Autowired
	private StudentInter studentInter;
	
	@GetMapping("/")
	@ResponseBody
	public List<Student> index()
	{
		return studentInter.getAllData();
	}
	
	@PostMapping("/addData")
	@ResponseBody
	public Student addData(@RequestBody Student student)
	{
		return studentInter.addData(student); 
	}
	
	@DeleteMapping("/deleteData")
	@ResponseBody
	public ResponseEntity<String> deleteData(@RequestParam("id") Long id)
	{
		studentInter.deleteData(id);
		return new ResponseEntity<>("Data deleted",HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/editData")
	@ResponseBody
	public Student editData(@RequestBody Student student)
	{
		return studentInter.editData(student);
	}
	
	@PutMapping("/addBookData")
	@ResponseBody
	public Student addBookDataById(@RequestParam("studentId") long id,@RequestParam("bookId") long b_id)
	{
		
		return studentInter.addBookDataByIdAndBookId(id,b_id);
	}
}
