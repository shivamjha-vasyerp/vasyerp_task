package com.example.security_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security_demo.model.UserData;

public interface UserDataRepo extends JpaRepository<UserData, Integer> {
	public UserData findByEmail(String email);
}
