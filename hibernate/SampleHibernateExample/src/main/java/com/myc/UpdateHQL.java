package com.myc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.myc.model.Employee;

public class UpdateHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//update emp set ename="" where empno = 1
		Session session = Config.getSession();
		Query<Employee> q = session.createQuery("update Employee eb set eb.sal=6000 where eb.empno>=:empno");
		q.setParameter("empno", 3);
		
		Transaction t = session.beginTransaction();
		
		q.executeUpdate();
		t.commit();
		
		
		q = session.createQuery("select eb from Employee eb");
		List<Employee> list = q.list();
		
		list.forEach(x->System.out.println(x.getEmpno()+"  "+x.getEname()));

	}

}
