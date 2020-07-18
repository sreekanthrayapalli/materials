package com.myc.threads;

public class C1Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj1 = new C1();
		C1 obj2 = new C1();
		C1 obj3 = new C1();
		obj1.name="hello";
		obj2.name = "bye";
		obj3.name="OK";
				
		obj1.start();
		obj2.start();
		obj3.start();
		/*obj1.run();
		obj2.run();*/
		
		try{
		obj1.join();
		
		}catch(Exception e){
			
		}
		System.out.println("end..");//main-thread
		
		

	}

}
