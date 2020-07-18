package com.bigacademe.p1.inhertiance;

public class SmartPhone extends BasicPhone{

	Battery obj;//has-a 
	public void call(){
		System.out.println("we can have conference call");
	}
	
	void applications(){
		call();
		super.call();
		System.out.println("install n number of appication depends on memory");
	}
}
