package com.myc.files;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputstreamExample {

	public static void main(String[] args) throws Exception {

		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("t2.txt"));
		
		Employee emp = new Employee(1, "abc", 5000);
		
		oos.writeObject(emp);
		
		oos.close();
		System.out.println("Object has been saved");
	}

}
