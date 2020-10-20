package com.myc.core.javaconfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleDao2 {

	@Autowired
	Connection con;
	
	@Autowired
	Sample s;
	
	public void getDataFromTable() {
		try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select empno,ename from emp");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"  "+rs.getString(2));
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(s.getA()+"   "+s.getMsg());
	}
}
