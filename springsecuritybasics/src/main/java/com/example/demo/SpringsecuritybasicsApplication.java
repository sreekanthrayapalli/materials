package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringsecuritybasicsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringsecuritybasicsApplication.class, args);
		
		BCryptPasswordEncoder be = new BCryptPasswordEncoder();
		System.out.println(be.encode("abc"));
	}

}
