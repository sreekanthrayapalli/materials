package com.myc.threads;

public class ExSampleThread {

	public static void main(String[] args) throws Exception {
		SampleRunnable s1 = new SampleRunnable("Hello");
		SampleRunnable s2 = new SampleRunnable("Bye");
		
		//here s1,s2 are runnable objects
		//
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		Thread t3 = new Thread(new SampleRunnable("Ok"));

		t1.start();
		t2.start();
	}

}
