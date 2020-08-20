package com.myc.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();//current date with no format
		System.out.println(date);
		//Date -->String format
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//printing date in specific format
		String result = sdf.format(date);
		
		System.out.println(result);
		
		sdf = new SimpleDateFormat("DD/MMM/yy");
		result = sdf.format(date);
		System.out.println(result);
		
		
		//String --->Date    21-08-2016
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		String userDate = "21-08-2016";//remove 100 days and find final date
		try {
			Date userDateObject = sdf1.parse(userDate);
			System.out.println(userDateObject);
			
			sdf = new SimpleDateFormat("dd-MMMM-yy");
			//change into 21-Auguest-16
			
			String finalResult = sdf.format(userDateObject);
			System.out.println("this is final result "+finalResult);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	

	}

}
