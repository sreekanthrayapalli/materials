package com.myc.threads;

public class Computer implements Runnable {

	private Printer obj;
	private String msg;
	
	public  Computer(Printer obj, String msg) {
		this.obj = obj;
		this.msg = msg;
	}
	
	@Override
	public void run() {
		obj.print(msg);
	}

}
