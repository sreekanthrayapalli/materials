package com.example.demo.config;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Jwts;

public class CheckTokenFilter extends BasicAuthenticationFilter {
  
    public CheckTokenFilter(AuthenticationManager authManager) {
        super(authManager);
    }
    
    @Override
    protected void doFilterInternal(HttpServletRequest req,
            HttpServletResponse res,
            FilterChain chain) throws IOException, ServletException {
        String authorizationHeader = req.getHeader("Authorization");
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer")) {
            chain.doFilter(req, res);
            throw new ServletException();
        }
        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(req, res);
    }  
    
    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest req) {
        String authorizationHeader = req.getHeader("Authorization");
         if (authorizationHeader == null) {
             return null;
         }

         String token = authorizationHeader.replace("Bearer", "");
         String userId = Jwts.parser()
                 .setSigningKey("salkdjflk33flk3234lkwe")
                 .parseClaimsJws(token)
                 .getBody()
                 .getSubject();

         if (userId == null) {
             return null;
         }
         return new UsernamePasswordAuthenticationToken(userId, null, new ArrayList<>());
     }
}