package com.myc;

import org.hibernate.Session;

import com.myc.model.Employee;

public class GetEmployeeData1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = Config.getSession();
		Employee emp = session.get(Employee.class, 1);
		System.out.println("data is getting from table");
		System.out.println(emp.getEmpno()+"   "+emp.getEname());
		
		session.close();
		
		session = Config.getSession();
		
		Employee emp3 = session.get(Employee.class, 1);
		System.out.println(emp3.getEmpno()+"  "+emp3.getEname());
		session.close();
		
	}

}