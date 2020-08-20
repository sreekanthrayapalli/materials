package com.myc.constructors;

public class C1 {

	C1(){
		System.out.println("default");
	}
	
	C1(int a){
		System.out.println("single parameter");
	}
	
	C1(int a,int b){
		this(a);
		System.out.println("two paramete");
	}
}
