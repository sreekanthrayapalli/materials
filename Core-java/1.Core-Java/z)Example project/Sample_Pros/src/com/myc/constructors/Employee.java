package com.myc.constructors;


//business logic
public class Employee {
	
	int empno;
	String ename;
	int sal;
	boolean isNRI;//default false
	
	//here empno,ename,sal are non-static/instance varaibles
	static String officeName;
	//officeName is static variable
	
	
	 Employee(){
		 
	 }
	
	 Employee(int empno,String ename,int sal){
		 this.empno = empno;
		 this.ename = ename;
		 this.sal = sal;		 
	 }
	 
	void displayDetails(){
		System.out.println(empno+"   "+ename+"  "+sal);
	}
	
	
	
}
