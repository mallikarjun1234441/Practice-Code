package com.dl.one;

public class Eg10 extends Thread {

	public static void main(String[] args) {
		//Changing the Priority of the thread by using the method setPriority()
		//Getting the Priority of the thread by the method getPriority()
		Eg10 eg1 = new Eg10();
		Eg10 eg2 = new Eg10();
		Eg10 eg3 = new Eg10();
		
		System.out.println(eg1.getPriority());
		System.out.println(eg2.getPriority());
		System.out.println(eg3.getPriority());
		
//		eg1.setPriority(11);//java.lang.IllegalArgumentException
		eg2.setPriority(6);
		eg3.setPriority(5);
		
		System.out.println(eg1.getPriority());
		System.out.println(eg2.getPriority());
		System.out.println(eg3.getPriority());
		
		System.out.println(" ");
	    eg1.setPriority(MAX_PRIORITY);
	    eg2.setPriority(NORM_PRIORITY);
	    eg3.setPriority(MIN_PRIORITY);
	    System.out.println(eg1.getPriority());
	    System.out.println(eg2.getPriority());
	    System.out.println(eg3.getPriority());
	    
	    System.out.println(MIN_PRIORITY);
	    System.out.println(MAX_PRIORITY);
	    System.out.println(NORM_PRIORITY);
	    
	    
		
		
	}
}
