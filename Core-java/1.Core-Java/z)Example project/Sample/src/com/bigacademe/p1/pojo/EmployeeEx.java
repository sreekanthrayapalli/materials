package com.bigacademe.p1.pojo;

public class EmployeeEx {

	public static void main(String[] args) {

		Employee e1 = new Employee(101,"abc",6000);
		//e1.empno = 100;//private
		
		e1.setEmpno(100);
		System.out.println(e1.getEmpno());
		
		e1.setEmpno(-200);
		
		System.out.println(e1.getEmpno());
	}

}
