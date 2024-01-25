package com.dl.one;

public class Eg3 extends Thread{

	public static void main(String[] args) {
		
//Whenever start() Method is called, run() method needed to be invoked
//start() method can be accessed only when extended from the thread class
		Eg3 eg = new Eg3();
		eg.start();
	}
		
	public void run() {
			System.out.println("Run Method");
			
		

	}

}
