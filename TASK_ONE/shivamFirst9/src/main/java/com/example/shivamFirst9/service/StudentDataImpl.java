package com.example.shivamFirst9.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shivamFirst9.model.StudentData;
import com.example.shivamFirst9.repository.StudentDataRepo;

@Service
public class StudentDataImpl implements StudentDataInter{

	@Autowired
	private StudentDataRepo s1;
	
	@Override
	public List<StudentData> getAllData() {
		
		return s1.findAll();
	}
	
	
}
