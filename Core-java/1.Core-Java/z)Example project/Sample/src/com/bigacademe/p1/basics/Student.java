package com.bigacademe.p1.basics;

//business logic
public class Student {

	int stdno;
	String stdname;
	int stdfee;
	
	void displayStudentInfo(){
		System.out.println(stdno+"   "+stdname+"  "+stdfee);
	}
	
	static void displaySchoolInfo(){
		System.out.println("ABC public School");
	}
}