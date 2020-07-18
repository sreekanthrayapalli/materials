package com.myc.threads;

public class Thread2 extends Thread {
	
	Resource r1;
	Thread2(Resource r1){
		this.r1 = r1;
	}
	public void run(){
		r1.m2();
	}

}
