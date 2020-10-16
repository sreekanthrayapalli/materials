package com.myc;

import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.myc.model.Employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class NativeSqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HQL, criteria API,
		Session session = Config.getSession();
		NativeQuery<Employee> q = session.createSQLQuery("select * from employee where empno>=3");
		q.addEntity(Employee.class);
		
		
		List<Employee> list = q.list();
		list.forEach(x->{
			System.out.println(x.getEmpno()+"  "+x.getEname());
		});
		
		q = session.createSQLQuery("update employee set sal=5500 where empno=1");
		
		q.addEntity(Employee.class);
		Transaction t = session.beginTransaction();
		int result = q.executeUpdate();
		t.commit();
		System.out.println("rows updated "+result);
	}

}
