package com.example.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task2.model.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
