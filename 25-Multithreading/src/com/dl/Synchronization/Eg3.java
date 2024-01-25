package com.dl.Synchronization;

public class Eg3 extends Thread {
	public void m1() {
		for (int i = 1; i < 5; i++) {

			System.out.println(i + "Non synchronized method");
		}
		
			
		
	}
//	public void run() {
//	System.out.println("Run Method");
//		
//	}

	public static void main(String[] args) {
		Eg3 eg3 = new Eg3();
		eg3.m1();
		eg3.start();
		

	}

}
