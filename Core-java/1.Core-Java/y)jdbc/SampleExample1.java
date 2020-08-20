package com.myc.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class SampleExample1 {

	public static void main(String[] args) throws Exception {
		
		Driver d = new OracleDriver();//Driver Object has been created..
		
		//This driver object will convert java calls to database understandable language
		
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password-1");
		//Connnect has been established
		
		Statement st = con.createStatement();//now can pass static queries
		
		//select data from emp table
		
		ResultSet rs = st.executeQuery("select * from emp");//for select query
		
		while(rs.next()){
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"   "+rs.getString(3));  //getString method retrieves value from specified columns
		}
		
		//close connection object
		con.close();
		

	}

}
