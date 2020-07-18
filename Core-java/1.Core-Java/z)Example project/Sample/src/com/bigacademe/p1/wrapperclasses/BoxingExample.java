package com.bigacademe.p1.wrapperclasses;

import java.util.Date;

public class BoxingExample {

	public static void main(String[] args) {

		/*int a = 10;//primitive
		Integer io = new Integer(a);// now io is an object this process is called boxing 
		
		char ch = 'a';
		Character co = new Character(ch);
		
		
		Double d = new Double(5000.23);
		
		double d1 = d.doubleValue();
		*/
		
		Integer io = 10;//auto boxing io is an Object
		int a = 100;
		Integer io1 = a;//auto boxing from java1.5
		
		Float f1 = 100.54f;//auto boxing f1 is an object
		//Float f1 = new Float(100.54f);
		float f2 = f1;//f2 is primitive data type
		//float f2 = f1.floatValue();
		
		Date d = new Date();
		
		
	}
	
	
	

}
