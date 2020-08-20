package com.bigacademe.p1.exceptions;

import java.util.Scanner;

public class PasswordExecution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter Password");
		String password = sc.nextLine();
		CheckPassword cp = new CheckPassword();
		try{
		cp.validatePassword(password);
		}catch(PasswordException pe){
			System.out.println("please give password properly");
		}
	}

}
