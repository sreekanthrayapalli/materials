package com.myc.threads;

public class Resource {
	
	private String s1="one";
	private String s2="two";
	
	public void m1(){
		System.out.println("enter into m1");
		synchronized (s1) {
				System.out.println("s1 is locked");
				synchronized (s2) {
					System.out.println("s2 is locked..");
				}
				System.out.println("s2 is realised");
		}
		System.out.println("s1 is realised");
	}
	
	public void m2(){
		System.out.println("enter into m2");
		synchronized (s2) {
				System.out.println("s2 is locked");
				synchronized (s1) {
					System.out.println("s1 is locked..");
				}
				System.out.println("s1 is realised");
		}
		System.out.println("s2 is realised");
	}

}
