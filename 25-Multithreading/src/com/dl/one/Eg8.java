package com.dl.one;

//Runnable Interface 
public class Eg8 implements Runnable{

	public static void main(String[] args) {
	
		Eg8 eg8 = new Eg8();
		Thread t1 = new Thread(eg8);
//		System.out.println(t1.getPriority());
	    t1.start();
	   Thread t2 = new Thread(eg8);
	   t2.start();
//	   System.out.println(t2.getPriority());
	   Thread t3 = new Thread(eg8);
	   t3.start();
	   t3.setPriority(2);
	   System.out.println(t3.getPriority());
	}

	@Override
	public void run() {
		System.out.println("Run Method");
		
		
	}

}
