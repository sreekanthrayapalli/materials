package com.bigacademe.p1.basics;

//this class execution logic class
//the class which is having main method is called exeuction logic class

class Bl{
	
}

public class HelloWorld {

	public static void main(String[] args) {

		Student.displaySchoolInfo();
		
		Student s1 = new Student();//default values
		Student s2 = new Student();//default values
		
		s1.stdno = 100;  //our own values
		s1.stdname = "kumar";
		s1.stdfee = 5000;
		
		s2.stdno = 101; //our own values
		s2.stdname="raju";
		s2.stdfee = 6000;
		
		s1.displayStudentInfo();
		s2.displayStudentInfo();
		
		
	}
}
