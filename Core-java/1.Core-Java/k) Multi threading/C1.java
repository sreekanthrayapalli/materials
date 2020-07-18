package com.myc.threads;

public class C1 extends Thread{
	
	public String name;
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
