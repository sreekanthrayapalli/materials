package com.bigacadememe.p1.inhertiance.constructors;

public class C2 extends C1{

	C2(){
		super(10);
		System.out.println("Default C2");
	}
	
	C2(int a){
		super(a);
		System.out.println("Parameter C2");
	}
	
	
}
