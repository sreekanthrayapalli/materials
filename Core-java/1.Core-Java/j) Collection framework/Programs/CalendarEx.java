package com.myc.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove 100 days and find final date
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		String userDate = "21-08-2016";
		try {
			Date userDateObject = sdf1.parse(userDate);
			System.out.println(userDateObject);
			
			Calendar cal = Calendar.getInstance();//current date and time
			cal.setTime(userDateObject);//cal object is having time of 21-08-2016
			
			//now remove 100 days
			cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)+100);
			
			//convert calendar object to Date objet
			
			userDateObject = cal.getTime();
			System.out.println("this is final result "+userDateObject);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
