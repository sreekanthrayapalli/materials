package com.myc.threads;

public class DeadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AccessResourceThread1 t1 = new AccessResourceThread1();
		AccessResourceThread2 t2 = new AccessResourceThread2();
		
		
		t1.start();
		
		Thread.sleep(300);
		t2.start();

	}

}
