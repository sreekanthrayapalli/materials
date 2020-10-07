package com.myc.threads;

public class ExLogicForComputerAndPrinter {

	public static void main(String[] args) {
		Printer p1 = new Printer();
		Printer p2 = new Printer();
		Printer p3 = new Printer();
		Thread c1 = new Thread(new Computer(p1, "hello"));
		Thread c2 =new Thread(new Computer(p1, "Bye"));
		Thread c3 =  new Thread(new Computer(p1,"Ok"));
		
		c1.start();
		c2.start();
		c3.start();
		
	
	}

}
