package com.myc.constructors;

public class Student {

	int stdno;
	String stdname;
	int fee;
	
	Student(){
		System.out.println("default");
		fee = 5000;
	}
	
	Student(int stdno,String stdname){
		this();//call default constructor
		System.out.println("two");
		this.stdno = stdno;
		this.stdname = stdname;
	}
	
	Student(int stdno,String stdname,int fee){
		this(stdno,stdname);
		this.fee = fee;
	}
}
