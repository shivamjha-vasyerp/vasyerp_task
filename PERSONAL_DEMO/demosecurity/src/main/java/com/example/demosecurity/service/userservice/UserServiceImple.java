package com.example.demosecurity.service.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demosecurity.model.userdata.UserData;
import com.example.demosecurity.repository.userrepo.UserDataRepo;

@Service
public class UserServiceImple implements UserInter {

	@Autowired
	private UserDataRepo userRepo;

	@Override
	public UserData userSave(UserData userData) {
		// TODO Auto-generated method stub
		UserData user = userData;
		user.setPassword(new BCryptPasswordEncoder().encode(userData.getPassword()));
		userRepo.save(user);
		return user;
	}

}
