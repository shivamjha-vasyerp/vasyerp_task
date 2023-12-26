package com.example.task3.service;

import java.util.List;

import com.example.task3.model.School;

public interface SchoolInter {
	List<School> getAllData();
	School addData(School school);
	void deleteData(long id);
	School editData(School student);
}
