package com.myc.threads;

public class SampleRunnable implements Runnable{

	private String msg;
	//Hello  -->5  3ms
	//bye-->5   3ms    -->6ms(without thread)    3-4ms(with thread)
	public SampleRunnable(String msg) {
		this.msg = msg;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(this.msg);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
