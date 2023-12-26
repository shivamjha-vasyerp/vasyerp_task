package com.example.task2.controller;

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

import com.example.task2.dto.TeacherDto;
import com.example.task2.model.Teacher;
import com.example.task2.service.TeacherInter;



@Controller
@RequestMapping("/teacher")
public class MainController {
	
	@Autowired
	private TeacherInter teacherInter;
	
	@GetMapping("/")
	@ResponseBody
	public List<TeacherDto> index()
	{
		return teacherInter.getAllData(); 
	}
	
	@PostMapping("/addData")
	@ResponseBody
	public Teacher addData(@RequestBody TeacherDto teacherDto)
	{
		return teacherInter.addData(teacherDto); 
	}
	
	@DeleteMapping("/deleteData")
	@ResponseBody
	public ResponseEntity<String> deleteData(@RequestParam("id") Long id)
	{
		teacherInter.deleteData(id);
		return new ResponseEntity<>("Data deleted",HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/editData")
	@ResponseBody
	public Teacher editData(@RequestBody TeacherDto teacher)
	{
//		System.out.println(teacher);
		return teacherInter.editData(teacher);
	}
}
