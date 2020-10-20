package com.myc.core.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);//Sample object is being created...
	    SampleDao sd = context.getBean(SampleDao.class);
	    sd.getDataFromTable();
	    
	    SampleDao2 sd2 = context.getBean(SampleDao2.class);
	    sd2.getDataFromTable();
	}
}
