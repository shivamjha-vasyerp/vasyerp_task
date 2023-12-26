package com.example.shivamFirst8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shivamFirst8.model.UserRegister;

@Repository
public interface UserDataRepo extends JpaRepository<UserRegister, Integer> {
}
