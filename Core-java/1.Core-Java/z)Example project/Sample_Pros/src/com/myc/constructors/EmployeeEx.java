package com.myc.constructors;

public class EmployeeEx {

	/**
	 * @param args
	 */
	//execution logic class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj = new Employee(100,"abc",5000);

		Employee obj1 = new Employee(101,"xyz",4000);
		
		obj.displayDetails();
		
		obj1.displayDetails();
		
		Employee e1 = new Employee();
		
		
		Employee.officeName = "xyz"; 
		
		Employee e = new Employee();
				
	}

}
