package com.myc.core.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sample {

	@Value("10")
	private int a;
	
	@Value("Hello")
	private String msg;
	
	public Sample() {
		System.out.println("Object has been created...");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
