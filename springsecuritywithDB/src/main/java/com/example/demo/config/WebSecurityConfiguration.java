package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public DaoAuthenticationProvider daoProvider() {
		DaoAuthenticationProvider dp = new DaoAuthenticationProvider();
		dp.setUserDetailsService(userDetailsService);
		dp.setPasswordEncoder(new BCryptPasswordEncoder());
		//dp.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return dp;
	}

}
