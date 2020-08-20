package com.bigacademe.p1.exceptions;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
   
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values..");
		
		try{
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int []d= new int[2];
		d[3]=7;
		int c = a/b;//Problematic statement this line may get exception 
		System.out.println(c);
		}catch(NumberFormatException nef){
			
		}catch(ArithmeticException ae){
			
		}catch(Exception ae){
			//ae.printStackTrace();
			System.out.println(ae);
		}finally{
			System.out.println("End");
		}
		
				
	}

}
