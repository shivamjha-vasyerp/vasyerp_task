package com.example.task1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task1.model.Library;
import com.example.task1.model.Student;
import com.example.task1.repository.StudentRepo;

@Service
public class StudentImple implements StudentInter {

	@Autowired
	private StudentRepo studentRepo;
	 
	
	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student addData(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public void deleteData(long id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	@Override
	public Student editData(Student student) {
		// TODO Auto-generated method stub
		Student updateStudent = studentRepo.findById(student.getId()).orElse(null);
		if (updateStudent != null) {
			updateStudent.setId(student.getId());
			updateStudent.setName(student.getName());
			updateStudent.setRollnumber(student.getRollnumber());
			updateStudent.setAge(student.getAge());
			updateStudent.setContact(student.getContact());
			studentRepo.save(updateStudent);
			return updateStudent;
		}
		return null;
	}

	@Override
	public Student addBookDataByIdAndBookId(long id, long b_id) {
		Student s1 = studentRepo.findById(id).get();
		Library l1 = new Library();
		l1.setId(b_id);
		s1.setLibrary(l1);
		
		return studentRepo.save(s1);
	}

}
