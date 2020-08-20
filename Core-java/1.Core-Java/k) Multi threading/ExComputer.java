package com.myc.threads;

public class ExComputer {
	public static void main(String arg[]){
		Printer p1 = new Printer();
		Computer.obj=p1;
		
		Computer c1 = new Computer("one");
		Computer c2 = new Computer("two");
		Computer c3 = new Computer("three");
		
		c1.start();
		c2.start();
		c3.start();
		
	}

}
