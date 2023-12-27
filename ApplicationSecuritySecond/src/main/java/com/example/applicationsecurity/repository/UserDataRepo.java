package com.example.applicationsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.applicationsecurity.model.UserData;

public interface UserDataRepo extends JpaRepository<UserData, Long> {
	public UserData findByEmail(String email);
}
