package com.bigacademe.p1.exceptions;

import java.util.Scanner;

public class Example2 {

	public static void displayAmount(int amount){
		if (amount < 0) {
			ArithmeticException ae = new ArithmeticException("-ve value");
			throw ae;
		}
		System.out.println(amount);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount..");
		int a = sc.nextInt();
		try{
		displayAmount(a);
		}catch(ArithmeticException ae){
			
		}

	}
}
