package com.myc.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main

		Date date = new Date();
		System.out.println(date);//dd-mm-yyyy
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String result =sdf.format(date);
		System.out.println(result);
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE,100);
		//System.out.println());
		
		Date date2 = c.getTime();
		System.out.println(date2);
		
	}

}
