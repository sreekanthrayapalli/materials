package com.bigacadememe.p1.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {

		int a[];//declaration
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size to the array");
		size = sc.nextInt();
		
		a = new int[size];
		Random r = new Random();
		for(int i=0; i<a.length; i++){
			a[i] = r.nextInt(10);
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		
		System.out.println("enter size agin to the array");
		size = sc.nextInt();
		
		a = new int[size];
		
		float b[] = new float[3];
		for(int i=0;i<b.length;i++){
			b[i] = r.nextFloat();
		}
		
	}

}
