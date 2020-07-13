package com.example.demo.batchsteps;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class StringWriter implements ItemWriter<Integer>{

	@Override
	public void write(List<? extends Integer> items) throws Exception {
		items.stream().forEach(a->{
			System.out.println(a);
		});
		
	}

}
