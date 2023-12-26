package com.example.task1.service;

import java.util.List;

import com.example.task1.model.Student;

public interface StudentInter {
	List<Student> getAllData();
	Student addData(Student student);
	void deleteData(long id);
	Student editData(Student student);
	Student addBookDataByIdAndBookId(long id,long b_id);
}
