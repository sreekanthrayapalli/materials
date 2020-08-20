package com.bigacademe.p1.exceptions;

public class CheckPassword {

	public void validatePassword(String password) throws PasswordException{
		int length = password.length();
		if(length > 6 && length<10){
			System.out.println("valid Password..");
		}else{
			PasswordException pe = new PasswordException();
			throw pe;
		}
	}
}
