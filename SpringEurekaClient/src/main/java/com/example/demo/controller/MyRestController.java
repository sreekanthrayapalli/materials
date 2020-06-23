package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Autowired
	Environment env;
	
	@RequestMapping("/getwish")
	public String getMessage() {
		return "hi hello"+env.getProperty("local.server.port");
	}

}
