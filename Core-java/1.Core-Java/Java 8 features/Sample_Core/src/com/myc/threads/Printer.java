package com.myc.threads;

public class Printer {

	public synchronized  void print(String msg) {//t1,t2, t3.. t10
		for(int i=0;i<5;) {
			System.out.println(msg);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
