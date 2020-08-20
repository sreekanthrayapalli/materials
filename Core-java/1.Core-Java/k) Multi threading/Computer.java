package com.myc.threads;

public class Computer extends Thread{
	
	static Printer obj;
	private String message;
	
	public Computer(String message){
		this.message = message;
	}
	
	public void run(){
		obj.print(message);
	}

}
