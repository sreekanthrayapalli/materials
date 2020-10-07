package com.myc.javafeatures.collection;

import java.util.ArrayList;
import java.util.List;

public class StreamExampleForEach {
	
	static void get(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "abc", 5000));
		list.add(new Employee(2,"xyz",6000));
		list.add(new Employee(3,"pqr",7000));
		
		list.stream().forEach(e->{
			System.out.println(e.getEname());
		});
		
		
		list.stream().map(s->s.getEname()).forEach(System.out::println);
	}

}
