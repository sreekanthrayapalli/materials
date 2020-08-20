package com.myc.superkeyincon;

public class C3 extends C2{

	C3(){
		super(10);
		System.out.println("C3 default");
	}
	C3(int a){
		super(a,20);
		System.out.println("C3 param");
	}
	C3(int a,int b){
		System.out.println("C3 two param");
	}
}
