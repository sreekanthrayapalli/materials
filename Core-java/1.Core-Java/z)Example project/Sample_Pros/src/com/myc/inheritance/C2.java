package com.myc.inheritance;

public class C2 extends C1{

	void m2(){
		System.out.println("m2..");
		super.m1();
		m1();
	}
	
	void m1(){
		System.out.println("m1 in C2");
	}
	
}
