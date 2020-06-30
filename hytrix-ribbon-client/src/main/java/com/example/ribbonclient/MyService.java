package com.example.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class MyService {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="defaultMethod",commandProperties={
	          @HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds", value = "30000") })
	public String getBackendCall() {
		
		try {
			Thread.sleep(45000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String randomString = this.restTemplate.getForObject("http://server/backend", String.class);
		return randomString;
	}
	
	public String defaultMethod() {
		return "Timeout Exception";
	}
}
