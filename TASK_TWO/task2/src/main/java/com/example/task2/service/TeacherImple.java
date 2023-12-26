package com.example.task2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task2.dto.TeacherDto;
import com.example.task2.model.Teacher;
import com.example.task2.repository.TeacherRepo;

@Service
public class TeacherImple implements TeacherInter {

	@Autowired
	private TeacherRepo teacherRepo;

	@Override
	public List<TeacherDto> getAllData() {

		// TODO Auto-generated method stub
		List<TeacherDto> l1 = new ArrayList<>();
		List<Teacher> ll1 = teacherRepo.findAll();

		for (Teacher s : ll1) {
			TeacherDto dt = new TeacherDto();
			dt.setName(s.getName());
			dt.setSubject(s.getSubject());
			dt.setContact(s.getContact());
			dt.setClass_teacher(s.getClass_teacher());
			l1.add(dt);
		}

		return l1;
	}

	@Override
	public Teacher addData(TeacherDto teacher) {
		// TODO Auto-generated method stub

		Teacher t1 = new Teacher();

		t1.setId(teacher.getId());
		t1.setName(teacher.getName());
		t1.setSubject(teacher.getSubject());
		t1.setContact(teacher.getContact());
		t1.setClass_teacher(teacher.getClass_teacher());
		System.out.println(t1);
		System.out.println(t1.getClass().getName());
		System.out.println("Hello world");
		return teacherRepo.save(t1);

	}

	@Override
	public void deleteData(long id) {
		// TODO Auto-generated method stub
		teacherRepo.deleteById(id);
	}

	@Override
	public Teacher editData(TeacherDto teacherDto) {
		// TODO Auto-generated method stub
		Teacher t1 = teacherRepo.findById(teacherDto.getId()).orElse(null);
		if (t1 != null) {

			t1.setId(teacherDto.getId());
			t1.setName(teacherDto.getName());
			t1.setSubject(teacherDto.getSubject());
			t1.setContact(teacherDto.getContact());
			t1.setClass_teacher(teacherDto.getClass_teacher());

			return teacherRepo.save(t1);
		}
		return null;
	}

}
