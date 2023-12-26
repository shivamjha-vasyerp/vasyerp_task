package com.example.security_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.security_demo.model.UserData;
import com.example.security_demo.repository.UserDataRepo;

@Component
public class CustomeUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDataRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserData user = userRepo.findByEmail(email);
		if(user==null)
		{
			throw new UsernameNotFoundException("Username not available");
			
		}
		else {
			return new CustomUser(user) ;
		}
		
	}

}
