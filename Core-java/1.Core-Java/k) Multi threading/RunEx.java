package com.myc.threads;

public class RunEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableEx obj1 = new RunnableEx();
		
		//obj1 is not having start method to call, because start() is not there
		//in Runnable interface or RunnableEx(implemented) so we need to convert
		//into Thread class object by using parameterized constructor
		Thread t1 = new Thread(obj1);//convert into thread class object
		t1.start();

	}

}
