package com.bigacademe.p1.constructors;

public class Employee {

	int empno;

	String ename;

	int sal;

	static String officeName;

	public Employee() {

	}

	// parameterized constructor
	public Employee(int empno, String ename, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	

	Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
		sal = 5000;
	}

	Employee(int empno) {
		this.empno = empno;
	}

	public void displayValues() {
		System.out.println(empno + "   " + ename + "   " + sal+"  "+officeName);
	}
}
