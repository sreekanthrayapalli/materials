package com.bigacademe.p1.strings;

import java.util.StringTokenizer;

public class Example1 {

	public static void main(String[] args) {
		String s = "hi,hello,ok,done";
		
		float f = 10.35f;
		

		String []sb = s.split(",");
		
		for(int i=0;i<sb.length;i++){
			System.out.println(sb[i]);
		}
		
		
		StringTokenizer st = new StringTokenizer(s, ",");
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
		
	}

}
