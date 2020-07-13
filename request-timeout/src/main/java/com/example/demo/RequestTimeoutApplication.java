package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.async.TimeoutCallableProcessingInterceptor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class RequestTimeoutApplication extends WebMvcConfigurationSupport{

	public static void main(String[] args) {
		SpringApplication.run(RequestTimeoutApplication.class, args);
	}
	
	@Override
	public void configureAsyncSupport(final AsyncSupportConfigurer configurer) {
	    configurer.setDefaultTimeout(5000);
	    configurer.registerCallableInterceptors(timeoutInterceptor());
	}

	@Bean
	public TimeoutCallableProcessingInterceptor timeoutInterceptor() {
	    return new TimeoutCallableProcessingInterceptor();
	}

}
