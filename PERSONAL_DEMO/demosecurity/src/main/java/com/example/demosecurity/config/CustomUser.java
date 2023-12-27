package com.example.demosecurity.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demosecurity.model.userdata.UserData;

public class CustomUser implements UserDetails {

	private UserData userData;

	public CustomUser(UserData user) {
		// TODO Auto-generated constructor stub
		this.userData = user; 
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userData.getUser_role());
		
		return Arrays.asList(grantedAuthority);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		
		return userData.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userData.getUser_name();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
