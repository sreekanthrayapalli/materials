package com.myc.javafeatures.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("abc");
		l.add("xyz");
		l.add("abc2");
		l.add("xyz2");
		l.add("abc3");
		
		List<String> result = new ArrayList<>();
		for(String s:l) {
			if(s.startsWith("abc")) {
				result.add(s);
			}
		}
		System.out.println(result);
		Stream<String> s = l.parallelStream();//convert list to stream
		Stream<String> s2= s.filter(s1->s1.startsWith("abc"));//apply the logic
		List<String> result2 = s2.collect(Collectors.toList());//stream to list
		System.out.println(result2);
		
		System.out.println(l.stream().filter(s1->s1.startsWith("abc")).collect(Collectors.toList()));
		
		
		
	}

}
