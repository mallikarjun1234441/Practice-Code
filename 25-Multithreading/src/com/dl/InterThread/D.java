package com.dl.InterThread;

public class D {
	public static void main(String[] args) throws InterruptedException {
		C c = new C();
		System.out.println("Object ref of C: " + c);
		Thread t = new Thread(c);
		t.start();
		System.out.println("Start Method");
		synchronized (c) {
			System.out.println("Synchronized block of class C");
			c.wait();
			for (int i = 6; i < 11; i++) {
				System.out.println(i + ": Synchronized block of main method in class D");

			}

		}

	}

}
