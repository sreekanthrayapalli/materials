package com.myc.files;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class WriteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub \n \r \t
		
		FileOutputStream fos = new FileOutputStream("G:\\summative for java\\t1.txt",true);
		String s = "helloworld2";
		byte []b = s.getBytes();
		fos.write(b);
		
		fos.close();
		/*
		 * 
		 //by using byte stream classes 
		FileOutputStream fos = new FileOutputStream("t1.txt",true);
		String s = "helloworld2";
		byte []b = s.getBytes();
		fos.write(b);
		
		fos.close();
		
		System.out.println("finish..");*/

		/*
		FileWriter fw = new FileWriter("t1.txt", true);
		fw.write("helloworld3");
		fw.close();
		System.out.println("finish");*/
	}

}
