package com.myc.thread;


class C1 extends Thread{
	
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 t1 = new C1();
		
		C1 t2 = new C1();
		
		C1 t3 = new C1();
		
		t1.setName("abc");
		
		System.out.println(t1.getName()+"   "+t2.getName()+"   "+t3.getName());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority()+"   "+t2.getPriority()+"  "+t3.getPriority());
	}

}
