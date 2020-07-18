package com.myc.accessspecifer1;

public class C1Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//same package
		C1 obj = new C1();
		
		System.out.println("value of a is "+obj.a);
		//System.out.println("value of b is "+obj.b); //this statemnt causes error because b is private variable
		System.out.println("value of c is "+obj.c);//we can accesss within child class +same package
		System.out.println("value of d is "+obj.d);
		
	}

}
