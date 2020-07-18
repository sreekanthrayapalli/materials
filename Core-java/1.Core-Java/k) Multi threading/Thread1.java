package com.myc.threads;

public class Thread1 extends Thread{
	Resource r1;
	Thread1(Resource r1){
		this.r1 = r1;
	}
	public void run(){
		r1.m1();
	}
}
