package com.example.demo.config;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.repo.UserRepository;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().anyRequest().authenticated();
		http.addFilter(getAuthenictationfiler());
		http.addFilter(getCheckTokenFilter());
		
		//it makes client is stateless
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
	}
	
	private Filter getAuthenictationfiler() throws Exception {

		AuthenicationFilter filter = new AuthenicationFilter(authenticationManager(), userRepository);
		filter.setAuthenticationManager(authenticationManager());
		return filter;
	}
	
	private Filter getCheckTokenFilter() throws Exception {
		CheckTokenFilter cf = new CheckTokenFilter(authenticationManager());
		return cf;
	}

	@Bean
	public DaoAuthenticationProvider daoProvider() {
		DaoAuthenticationProvider dp = new DaoAuthenticationProvider();
		dp.setUserDetailsService(userDetailsService);
		dp.setPasswordEncoder(new BCryptPasswordEncoder());
		//dp.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return dp;
	}

}
