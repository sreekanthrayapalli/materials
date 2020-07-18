package com.myc.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Types;

import oracle.jdbc.driver.OracleDriver;

public class CollableProcedure {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Driver d = new OracleDriver();//Driver Object has been created..
		
		//This driver object will convert java calls to database understandable language
		
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password-1");
		//Connnect has been established
		

		CallableStatement cs = con.prepareCall("{call p1(?,?,?,?)}");
		//set input value
		cs.setInt(1, 7499);
		
		//register output types
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.registerOutParameter(3, Types.INTEGER);
		cs.registerOutParameter(4, Types.INTEGER);
		
		//execute procedure
		cs.execute();
		
		System.out.println("ooutput "+cs.getString(2)+"  "+cs.getInt(3)+"   "+cs.getInt(4));
		
		//close connection
		con.close();
		
	}

}
