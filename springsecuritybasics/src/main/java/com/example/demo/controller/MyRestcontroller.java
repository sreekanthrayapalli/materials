package com.example.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestcontroller {

	@RequestMapping("/getwish")
	public String getWish() {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = "";
		if (principal instanceof UserDetails) {
		 username = ((UserDetails)principal).getUsername()+  " "+((UserDetails)principal).getPassword();
		}
		System.out.println("Username is "+username);
		return "Hi.. Hello...";
	}
}
