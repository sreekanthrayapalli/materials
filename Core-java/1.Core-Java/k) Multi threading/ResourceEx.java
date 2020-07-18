package com.myc.threads;

public class ResourceEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r1 = new Resource();
		Thread1 t1 = new Thread1(r1);
		Thread2 t2 = new Thread2(r1);
		
		t1.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}

}
