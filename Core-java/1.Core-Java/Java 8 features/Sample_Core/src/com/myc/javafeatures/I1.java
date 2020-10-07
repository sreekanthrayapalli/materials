package com.myc.javafeatures;

public interface I1 {

	default void m1() {
		System.out.println("this is m1 method");
	}
	void m2();
	
	static void m3() {
		
	}
}
