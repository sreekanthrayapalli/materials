package com.myc.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class PreparedStatementInsertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Driver d = new OracleDriver();//Driver Object has been created..
		
		//This driver object will convert java calls to database understandable language
		
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password-1");
		
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,6000)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empno");
		String empno = sc.next();//got input from user
		System.out.println("enter enmae");
		String ename = sc.next();
		/*System.out.println("enter sal");
		int sal = sc.nextInt();*/
		
		//set deptno to ps object
		ps.setString(1, empno);
		ps.setString(2, ename);
		//ps.setInt(3, sal);
		
		int i=ps.executeUpdate();
		
		System.out.println("data is inserted..");
		//close connection
		con.close();
		
	}

}
