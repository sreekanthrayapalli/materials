package com.myc.threads;

public class Printer {
	
	synchronized void print(String s){
		for(int i=0;i<5;i++){
			System.out.println(s);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
