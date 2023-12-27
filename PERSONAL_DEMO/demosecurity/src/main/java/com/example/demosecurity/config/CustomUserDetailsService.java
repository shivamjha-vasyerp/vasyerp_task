package com.example.demosecurity.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demosecurity.model.userdata.UserData;
import com.example.demosecurity.repository.userrepo.UserDataRepo;

@Component
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserDataRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserData user = userRepo.findByEmail(email);
		if(user==null)
		{
			throw new UsernameNotFoundException("User is not existed in database");
		}
		else {
			System.out.println(user.getPassword());
			return new CustomUser(user);
		}
	}

}
