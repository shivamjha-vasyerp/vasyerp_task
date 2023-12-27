package com.example.demosecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService getDetailsService() {
		return new CustomUserDetailsService();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		daoAuthenticationProvider.setUserDetailsService(getDetailsService());
		System.out.println(getDetailsService());
		return daoAuthenticationProvider;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	.formLogin().loginPage("/signin").loginProcessingUrl("/userLogin")
//		//.usernameParameter("email")
//		.defaultSuccessUrl("/user/profile").permitAll();
//		
		http.csrf().disable().authorizeHttpRequests().requestMatchers("/","/register","/signin","/saveUser").permitAll()
		.requestMatchers("/user/**").authenticated().and()
		.formLogin().loginPage("/login").loginProcessingUrl("/login").defaultSuccessUrl("/user/home").permitAll();
		return http.build();
	}
}
