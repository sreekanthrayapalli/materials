package com.myc.superkeyincon;

public class C2 extends C1{

	C2(){
		System.out.println("C2 default");
	}
	
	C2(int a){
		super(a);
		System.out.println("C2 param..");
	}
	C2(int a,int b){
		System.out.println("C2 two param");
	}
	
}
