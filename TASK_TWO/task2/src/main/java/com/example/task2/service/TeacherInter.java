package com.example.task2.service;

import java.util.List;

import com.example.task2.dto.TeacherDto;
import com.example.task2.model.Teacher;

public interface TeacherInter {
	List<TeacherDto> getAllData();

	Teacher addData(TeacherDto teacherDto);

	void deleteData(long id);

	Teacher editData(TeacherDto teacherDto);

}
