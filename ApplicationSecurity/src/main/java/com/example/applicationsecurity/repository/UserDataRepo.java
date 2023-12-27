package com.example.applicationsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.applicationsecurity.model.UserData;

@Repository
public interface UserDataRepo extends JpaRepository<UserData, Integer> {
	public UserData findByEmail(String email);
}
