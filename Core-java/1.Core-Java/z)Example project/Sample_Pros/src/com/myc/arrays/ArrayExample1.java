package com.myc.arrays;

import java.util.Arrays;

public class ArrayExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int []a = new int[10];
		
		int []a = {10,5,2,7,-10,100};
		 
		int b[] = new int[10];

		
		
		
		Arrays.sort(a);
		
		System.out.println("after sorting");
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
		
		int result = Arrays.binarySearch(a, -1);
		System.out.println("after sorting postion is "+result);
		
		
		
	}

}
