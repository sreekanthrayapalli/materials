package com.myc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myc.model.Employee;

public class InsertEmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(5, "ABC", 5000);
		Configuration cfg = new Configuration();
		
		cfg.configure();//it reads data from hibernate.cfg.xml
		//cfg.configure("filename");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		s.save(emp);//now employee has been saved
		
		Transaction t = s.beginTransaction();
		t.commit();//data is going to table
		
		
		s.close();

		System.out.println("Data has been saved..");
		sf.close();
	}

}
