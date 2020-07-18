package com.myc.collections;

import java.util.Comparator;

public class EmployeeSortBySal implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSal()-o2.getSal();
	}

}
