package com.myc.javafeatures.methodref;

public class LambdaexpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I1 obj = (x,y)->{
			System.out.println("this is example for lambda..");
		};

		obj.ddd(10, 20);
		
		
		Runnable r = ()->{
			System.out.println("hello this is runnable");
			System.out.println("this idlsfjsdl");
		};
		
		
		Runnable r2 = ()->System.out.println("alskdjfl");
		
		
		Thread t = new Thread(()->System.out.println("ok"));
	}

}
