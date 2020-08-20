package com.example.demo.controller;

import java.util.concurrent.Callable;

import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class MyController {

	
	@RequestMapping("/hello")	
	@org.springframework.transaction.annotation.Transactional(timeout=100)
	public Callable<String> getHello() {
		
		return new Callable<String>() {
	        @Override
	        public String call()  {
	            try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return "timeout";
				} //this will cause a timeout
	            return "foobar";
	        }
	    };
	}
}