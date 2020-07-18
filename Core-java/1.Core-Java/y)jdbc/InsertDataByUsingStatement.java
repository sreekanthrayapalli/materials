package com.myc.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class InsertDataByUsingStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Driver d = new OracleDriver();//Driver Object has been created..
		
		//This driver object will convert java calls to database understandable language
		
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password-1");
		//Connnect has been established
		
		Statement st = con.createStatement();//now can pass static queries
		
		
		//int i = st.executeUpdate("insert into employee values('200','abc2',5000)");
		//for insert query
		
		int i = st.executeUpdate("delete from employee where sal=5000");
		//for deletion query
		
		
		System.out.println("data is inserted..."+i);
		
		//close connection
		con.close();

	}

}
