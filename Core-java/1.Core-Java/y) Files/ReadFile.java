package com.myc.files;

import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 //by using byte stream
		  FileInputStream fis = new FileInputStream("t1.txt");

		StringBuffer result =new StringBuffer();
		int a;
		while((a=fis.read())!=-1){
		char ch=(char)a;
		result.append(ch);
		}
		System.out.println(result);
		fis.close();*/
		
		//byusing character stream
		FileReader fr = new FileReader("t1.txt");
		String result ="";
		int a;
		while((a=fr.read())!=-1){
			char ch = (char)a;
			result += ch;
		}
		System.out.println(result);
		
		fr.close();
	}

}
