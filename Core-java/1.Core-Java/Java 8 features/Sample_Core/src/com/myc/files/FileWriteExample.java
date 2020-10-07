package com.myc.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		FileOutputStream fos = null;//declaration    \n, \t, \\->\   \"  "
		try {
		 fos = new FileOutputStream("E:\\Material\\t1.txt");
		 String s = "hello how are you";
		 byte []b = s.getBytes();
		 fos.write(b);
		 System.out.println("File is created..");
		}catch(FileNotFoundException e) {
			System.out.println("file is not there..");
		}catch(IOException e) {
			System.out.println("There is some error while writting data");
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}catch(NullPointerException ne) {
				System.out.println("File is not created... so no need to close");
			}
		}
	}

}
