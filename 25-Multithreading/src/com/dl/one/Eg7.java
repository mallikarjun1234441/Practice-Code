package com.dl.one;

//Creating the thread by extending the Thread class
public class Eg7 extends Thread {
	
	//Whenever the start() method is called the run() method needed to be invoked
	//start() Method can be accessed only when the class extends Thread class
	public static void main(String[] args) {
		
		Thread t1 = new Eg7();
		t1.start();
		
	
	}
	public void run() {
		System.out.println("Run Method");
	}
	

}
