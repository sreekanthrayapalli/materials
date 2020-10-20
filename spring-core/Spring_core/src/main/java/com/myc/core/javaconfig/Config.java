package com.myc.core.javaconfig;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.myc")
@PropertySource(value = {"application.properties"})
public class Config {

	@Autowired
	Environment env;
	
	@Bean
	public Connection getConnection() {
		System.out.println("connection object has been created..");
		Connection con = null;
		try {
			Driver d = new com.mysql.jdbc.Driver();
			con = DriverManager.getConnection(env.getProperty("jdbc.mysql.url"), env.getProperty("jdbc.mysql.username"), env.getProperty("jdbc.mysql.password"));;
		} catch (Exception e) {
		} finally {
		}
		return con;
	}

	@Bean
	public static PropertyPlaceholderConfigurer getPropertyFiles() {
		return new PropertyPlaceholderConfigurer();
	}
}