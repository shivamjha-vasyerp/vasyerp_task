package com.example.shivamFirst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.shivamFirst.model.StudentData;

@Service
public class StudentDetails implements studentDataIn{
    List<StudentData> l1 = new ArrayList<>();
    
    private void setData()
    {
    	StudentData s = new StudentData();
    	s.setId(0);
    	s.setMarks(10);
    	s.setName("Shivam jha");
    	s.setAge(20);
    	
    	
    	StudentData s1 = new StudentData();
    	s1.setId(1);
    	s1.setMarks(20);
    	s1.setName("Ritik jha");
    	s1.setAge(21);
    	
    	l1.add(s);
    	l1.add(s1);
    }
	@Override
	public void disp_Name() {
		// TODO Auto-generated method stub
		l1.clear();
		setData();
		System.out.println(l1.get(0).getName());
	}

	@Override
	public void disp_Details() {
		// TODO Auto-generated method stub
		l1.clear();
		setData();
		System.out.println(l1.get(0));
	}

}
