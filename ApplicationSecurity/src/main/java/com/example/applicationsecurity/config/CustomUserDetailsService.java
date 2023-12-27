package com.example.applicationsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.applicationsecurity.model.UserData;
import com.example.applicationsecurity.repository.UserDataRepo;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	 UserDataRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserData user = userRepo.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("Username not found in database");

		} else {
			return new CustomUser(user);
		}
	}
}
