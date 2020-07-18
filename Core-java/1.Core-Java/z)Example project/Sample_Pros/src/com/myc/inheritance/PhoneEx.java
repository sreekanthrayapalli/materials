package com.myc.inheritance;

public class PhoneEx {
	public static void main(String[] args) {
		NormalPhone np = new NormalPhone();
		np.call();
		np.msg();


		//create child class object
		
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.gps();
		sp.internet();
	}
}
