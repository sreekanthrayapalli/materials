package com.myc;

import org.hibernate.Session;

import com.myc.model.Employee;

public class DeleteOrUpdateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = Config.getSession();
		Employee emp= new Employee(4, "abc4", 5000);
		//session.delete(emp);
		session.update(emp);
		session.beginTransaction().commit();

		session.close();
		System.out.println("competed..");
	}

}
