package com.example.demosecurity.repository.userrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demosecurity.model.userdata.UserData;

public interface UserDataRepo extends JpaRepository<UserData, Integer> {

	public UserData findByEmail(String email);
}
