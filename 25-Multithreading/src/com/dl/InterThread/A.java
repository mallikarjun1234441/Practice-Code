package com.dl.InterThread;

public class A {
	public static void main(String[] args) throws InterruptedException {
		B b = new B();
		System.out.println("Object ref of B: " + b);
		Thread t = new Thread(b);
		t.start();
		System.out.println("Start Method");
		synchronized (b) {
			System.out.println("Synchronized Block of Class A");
			b.wait();
			for (int i = 0; i < 5; i++) {
				System.out.println(i + ": Main method for loop inside sychronized Block");

			}

		}

	}
}
 
