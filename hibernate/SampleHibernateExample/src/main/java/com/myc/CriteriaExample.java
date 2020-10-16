package com.myc;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
//5.2

import com.myc.model.Employee;

public class CriteriaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can dml(insert,update,delete) select also
		/*
		 * Session session = Config.getSession(); Criteria cr =
		 * session.createCriteria(Employee.class); Criterion con =
		 * Restrictions.ge("sal", 4500); cr.add(con);
		 * 
		 * List<Employee> list = cr.list(); list.forEach(x->{
		 * System.out.println(x.getEmpno()+"  "+x.getEname()+"    "+x.getSal()); });
		 */

		Session session = Config.getSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> r = cq.from(Employee.class);
		cq.select(r).where(cb.gt(r.get("sal"), 4500));
		Query<Employee> q = session.createQuery(cq);
		List<Employee> list = q.list();
		list.forEach(x -> {
			System.out.println(x.getEmpno() + "  " + x.getEname() + "    " + x.getSal());
		});
		session.close();
	}

}
