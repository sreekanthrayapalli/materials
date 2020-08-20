package com.bigacademe.p1.constructors;

public class EmployeeEx {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(100,"abc",6000);
		
		Employee e2 = new Employee(101,"xyz",7000);
		
		
		
		
		Employee e3 = new Employee(102,"pqr");
		
		Employee e4 = new Employee(105);
		

		e1.displayValues();
		e2.displayValues();
		e3.displayValues();
		e4.displayValues();
	}

}
