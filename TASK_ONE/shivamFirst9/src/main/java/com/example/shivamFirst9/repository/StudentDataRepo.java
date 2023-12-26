package com.example.shivamFirst9.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shivamFirst9.model.StudentData;

@Repository
public interface StudentDataRepo extends JpaRepository<StudentData, Integer>{
}
