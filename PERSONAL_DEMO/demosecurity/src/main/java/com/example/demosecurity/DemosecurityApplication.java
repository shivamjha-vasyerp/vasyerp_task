package com.example.demosecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemosecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosecurityApplication.class, args);
//		System.out.println(new BCryptPasswordEncoder().encode("1234"));
	}

}
