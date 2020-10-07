package com.myc.javafeatures.methodref;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleMethods sm = new SampleMethods();
		I1 obj = sm::m1;
		obj.ddd(10, 20);
		
		
		I1 obj2 = sm::m2;///I1 obj2 = new C1();//ddd()
		obj2.ddd(11, 12);	
		
		
		Runnable r = sm::m5;
		Thread t = new Thread(r);
		t.start();
		
		Thread t2 = new Thread(sm::m5);
		t2.start();
		
		
		Runnable r2 = SampleMethods::m6;
	}

}
