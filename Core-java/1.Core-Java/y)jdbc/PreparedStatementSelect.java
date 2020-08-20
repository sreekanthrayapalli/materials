package com.myc.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class PreparedStatementSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Driver d = new OracleDriver();//Driver Object has been created..
		
		//This driver object will convert java calls to database understandable language
		
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password-1");
		
		PreparedStatement ps = con.prepareStatement("select * from emp where deptno=? or ename=?");
		//deptno can pass in run time
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter deptno ");
		int deptno = sc.nextInt();//got input from user
		System.out.println("enter enmae");
		String ename = sc.next();
		
		//set deptno to ps object
		ps.setInt(1, deptno);
		ps.setString(2, ename);
		
		
		//now execute query
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"   "+rs.getString(3));  //getString method retrieves value from specified columns
		}
		
		//close connection object
		con.close();
	}

}
