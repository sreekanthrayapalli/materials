package com.bigacademe.p1.strings;

public class Example2 {

	public static void main(String[] args) {

		int sum =0;
		String arr[] = { "?2AA?", "?12?", "?ABC?", "?c1a?" };
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if(Character.isDigit(ch)){
					int k= Integer.parseInt(ch+"");
					sum = sum+k;
				}
			}

		}
		System.out.println(sum);
	}

}
