package com.myc.files;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {

	public static void main(String[] args) throws Exception{

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t2.txt"));
		
		//Employee emp = (Employee)ois.readObject();
		Object obj = ois.readObject();
		Employee emp = (Employee)obj;
		System.out.println(emp.getEmpno()+"  "+emp.getEname());
	}

}
