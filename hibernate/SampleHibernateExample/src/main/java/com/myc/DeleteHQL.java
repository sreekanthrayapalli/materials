package com.myc;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = Config.getSession();
		
		Query q = session.createQuery("delete from Employee eb where eb.empno=:empno");
		q.setParameter("empno", 3);
		Transaction t = session.beginTransaction();
		q.executeUpdate();//delete query will be executed
		t.commit();//data will be reflected in db
		session.close();

	}

}
