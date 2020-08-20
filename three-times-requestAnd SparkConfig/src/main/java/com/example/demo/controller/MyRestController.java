package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Autowired
	HttpSession session;

	@RequestMapping("hello")
	public String getHello() {
		
		Object obj =session.getAttribute("count");
		if(obj == null) {
			session.setAttribute("count", 1);
		}else {
			Integer count = (Integer)obj;
			if(count == 3) {
				session.setAttribute("count", 1);
				return "Time Out";
			}
			session.setAttribute("count", ++count);
		}
		return "hello";
	}
	
	@PostMapping("hello")
	public String getPost(@RequestBody String c) {
		return getHello();
	}
}
