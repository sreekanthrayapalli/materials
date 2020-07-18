package com.myc.jdbc.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Example2 {

	public static void main(String[] args) throws Exception{

		Driver d = new com.mysql.jdbc.Driver();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		Statement st = con.createStatement();
		int result = st.executeUpdate("update std set stdname='pqr' where stdno in (1,2)");
		con.close();
		System.out.println("finished"+result);
	}

}
