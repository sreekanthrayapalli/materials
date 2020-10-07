package com.myc.threads;

public class AccessResourceThread1 extends Thread{

	public void run() {
		synchronized (Resouces.s1) {
			System.out.println("s1 is locked by thread1"+Resouces.s1);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (Resouces.s2) {
				System.out.println("s2 is locked by thread1"+Resouces.s1);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
