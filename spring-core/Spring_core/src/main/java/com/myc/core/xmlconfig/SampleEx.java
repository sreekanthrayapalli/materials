package com.myc.core.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");//Sample object is being created...
		Sample sample = context.getBean(Sample.class);//access that object
		System.out.println(sample.getA()+"    "+sample.getMsg());//get values
		
		
		A obj = context.getBean(A.class);
		System.out.println(obj.getA()+"   "+obj.getB());
	}

}
