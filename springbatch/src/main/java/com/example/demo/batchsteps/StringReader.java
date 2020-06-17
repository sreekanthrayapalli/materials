package com.example.demo.batchsteps;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class StringReader implements ItemReader<String>{
	
	String []arr = {"abc","xyz","pqr"};

	int a = 0;
	//2  
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		if(arr.length > a) {
			return arr[a++];
		}
		else {
			a= -1;
		}
		return null;
	}

}
