package com.myc.javafeatures.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("abc");
		l.add("xyz");
		
		List<String> l2 = Arrays.asList("abc","xyz","pqr");
		
		
		Consumer<String> c = (s)->{
			System.out.println(s);
		};
		l2.forEach(c);
		
		l2.forEach(s->{
			System.out.println(s);
		});
	}

}
