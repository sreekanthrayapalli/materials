package com.example.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyClientSideController {
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	MyService myService;
	
	@RequestMapping("/client/frontend")
	public String hi() {
		String randomString = myService.getBackendCall();
		return "Server Response :: " + randomString;
	}
}
