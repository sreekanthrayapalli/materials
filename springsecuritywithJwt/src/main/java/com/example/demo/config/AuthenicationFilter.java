package com.example.demo.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.model.User;
import com.example.demo.model.UserDetailsModel;
import com.example.demo.repo.UserRepository;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class AuthenicationFilter extends UsernamePasswordAuthenticationFilter {

	private UserRepository userRepo;

	@Autowired
	public AuthenicationFilter(AuthenticationManager authenticationManager, UserRepository userRepository) {
		super.setAuthenticationManager(authenticationManager);
		this.userRepo = userRepository;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		try {//

			User model = new User();

			model.setUsername(request.getParameter("username"));
			model.setPassword(request.getParameter("password"));
			return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(model.getUsername(),
					model.getPassword(), new ArrayList<>()));

		} catch (Exception e) {
			throw new RuntimeException();
		}
		// return super.attemptAuthentication(request, response);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		String username = ((UserDetailsModel) authResult.getPrincipal()).getUsername();
		User userDto = userRepo.findByUsername(username);

		String token = Jwts.builder().setSubject(userDto.getId() + "")
				.setExpiration(new Date(System.currentTimeMillis() + Long.parseLong("864000000")))
				.signWith(SignatureAlgorithm.HS512, "salkdjflk33flk3234lkwe").compact();

		response.addHeader("token", token);
		response.addHeader("userId", userDto.getId() + "");

	}
}