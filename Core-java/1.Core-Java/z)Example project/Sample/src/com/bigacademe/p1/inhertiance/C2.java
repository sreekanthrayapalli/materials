package com.bigacademe.p1.inhertiance;

public class C2 extends C1{

	int a;
	int c;
	int d;
	
	void m1(){
		System.out.println("m1 method from C2");
	}
	
	void m2(){
		m1();
		super.m1();
		System.out.println("this is m2 in C2");
	}
	
	void displayValues(int a){
		a=10;//local variable
		this.a = 15;//non-static variable
		super.a = 20;//parent class variable
	}
}
