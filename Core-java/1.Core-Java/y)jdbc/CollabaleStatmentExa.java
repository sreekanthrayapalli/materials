package com.myc.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class CollabaleStatmentExa {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Driver d = new OracleDriver();//Driver Object has been created..
		
		//This driver object will convert java calls to database understandable language
		
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password-1");
		//Connnect has been established
		
		CallableStatement cs = con.prepareCall("{?=call f1(?)}");
		
		//set input values
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empno");
		int empno= sc.nextInt();
		
		cs.setInt(2, empno);
		
		//register output type
		cs.registerOutParameter(1, Types.INTEGER);
		
		//execute cs
		cs.execute();
		
		//get output value
		int output =cs.getInt(1);
		
		System.out.println("employee salary is "+output);
		
		
		con.close();
		

	}

}
