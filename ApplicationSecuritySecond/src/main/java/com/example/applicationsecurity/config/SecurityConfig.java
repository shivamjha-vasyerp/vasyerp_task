package com.example.applicationsecurity.config;

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
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService getUserService()
	{
		return new CustomUserDetailsService();
	}
	@Bean
	public DaoAuthenticationProvider provider()
	{
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		authenticationProvider.setUserDetailsService(getUserService());
		return authenticationProvider;
	}
	

	@Bean

	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeHttpRequests().requestMatchers("/").permitAll().anyRequest().authenticated()

				.and().formLogin().loginPage("/signin").loginProcessingUrl("/login").defaultSuccessUrl("/about").permitAll().and().logout().logoutSuccessUrl("/userlogout").permitAll();

		return http.build();

	}
}
