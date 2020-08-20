package com.myc.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExForEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> sets = new HashSet<>();
		sets.add(new Employee(1, "abc", 5000));
		sets.add(new Employee(2, "xyz", 60000));
		sets.add(new Employee(1,"abc",5000));
		System.out.println(sets.size());
		
		for(Employee emp : sets){
			System.out.println(emp.getEmpno()+"  "+emp.getEname()+"  "+emp.getSal()+" "+emp.hashCode());
		}
		
	/*	Set<Integer> nums = new HashSet<>();
		nums.add(10);
		nums.add(20);
		nums.add(10);*/

	}

}
