package com.example.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task1.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
