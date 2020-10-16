package com.myc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.myc.model.Employee;

public class HQLSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = Config.getSession();
		
		Query q = session.createQuery("select e from Employee e where e.empno >= :empno");
		
		q.setParameter("empno", 3);
		List<Employee> list = q.list();
		
		list.forEach(x->{
			System.out.println(x.getEmpno()+" "+x.getEname());
		});
		
		session.close();
		
	}

}
