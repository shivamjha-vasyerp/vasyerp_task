package com.example.task3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task3.model.School;
import com.example.task3.repository.SchoolRepo;

@Service
public class SchoolImple implements SchoolInter {

	@Autowired
	SchoolRepo schoolrepo;

	@Override
	public List<School> getAllData() {
		// TODO Auto-generated method stub

		return schoolrepo.findAll();
	}

	@Override
	public School addData(School school) {
		// TODO Auto-generated method stub
		return schoolrepo.save(school);
	}

	@Override
	public void deleteData(long id) {
		// TODO Auto-generated method stub
		schoolrepo.deleteById(id);
	}

	@Override
	public School editData(School student) {
		// TODO Auto-generated method stub
		School updateSchool = schoolrepo.findById(student.getId()).orElse(null);
		if (updateSchool != null) {
			updateSchool.setId(student.getId());
			updateSchool.setName(student.getName());
			updateSchool.setLocation(student.getLocation());
			updateSchool.setTotal_classroom(student.getTotal_classroom());
			schoolrepo.save(updateSchool);
			return updateSchool;
		}
		return null;
	}

}
