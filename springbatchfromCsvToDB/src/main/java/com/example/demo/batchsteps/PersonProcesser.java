package com.example.demo.batchsteps;

import org.springframework.batch.item.ItemProcessor;

import com.example.demo.model.Person;

public class PersonProcesser implements ItemProcessor<Person, Person>{

	@Override
	public Person process(Person p) throws Exception {
		// TODO Auto-generated method stub
		p.setFirstName(p.getFirstName().toUpperCase());
		p.setLastName(p.getLastName().toUpperCase());
		
		return p;
	}

}
