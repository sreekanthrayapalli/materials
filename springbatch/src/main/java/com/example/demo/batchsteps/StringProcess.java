package com.example.demo.batchsteps;

import org.springframework.batch.item.ItemProcessor;

public class StringProcess implements ItemProcessor<String, Integer>{

	@Override
	public Integer process(String item) throws Exception {
		// TODO Auto-generated method stub
		return item.length();
	}

}
