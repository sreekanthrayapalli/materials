package com.bigacademe.p1.constructors;

public class C1 {
	
	C1(int a){
		System.out.println("single parameter");
	}

	C1(int a,int b){
		System.out.println("two parameter");
	}
	
	C1(int a,int b,int c){
		this(a);
		System.out.println("three paramter");
	}
}
