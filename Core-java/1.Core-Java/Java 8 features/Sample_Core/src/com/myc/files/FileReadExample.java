package com.myc.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) {
		FileInputStream fis=null;

		try {
			fis = new FileInputStream("E:\\Material\\t1.txt");
			int a ;
			StringBuffer sb = new StringBuffer();
			String s = "";
			while((a=fis.read())!=-1) {    //
				char ch = (char)a;
				sb.append(ch);
				s = s+ch;
			}
			
			System.out.println(new String(sb));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException ie) {
			
		}
	}

}
