package com.myc.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class MetaExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Driver d = new OracleDriver();//Driver Object has been created..
		
		//This driver object will convert java calls to database understandable language
		
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password-1");
		//Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		//Connnect has been established
		
		Statement st  = con.createStatement();
		ResultSet rs = st.executeQuery("select * from emp");
		
		//get table info from resultset object
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("table name is "+rsmd.getTableName(1));
		
		System.out.println("colum count "+rsmd.getColumnCount());
		
		for(int i=1;i<=rsmd.getColumnCount();i++){
			System.out.println(rsmd.getColumnName(i));
		}
		
		
		//get database information from Connection object
		DatabaseMetaData dmd = con.getMetaData();
		System.out.println("datbase name is "+dmd.getDatabaseProductName());
		System.out.println("database version is "+dmd.getDatabaseMajorVersion());
		
		
		con.close();

	}

}
