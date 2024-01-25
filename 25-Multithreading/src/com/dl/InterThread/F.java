package com.dl.InterThread;

public class F {

	public static void main(String[] args) throws InterruptedException {
		E e = new E();
		System.out.println(1 + ": Object ref no ");
		Thread t = new Thread(e);
		t.start();
		System.out.println(2 + ": Start Method");
		synchronized (e) {
			System.out.println(3 + ": Synchronized block of class A");
			e.wait();
			for (int i = 6; i < 11; i++) {
				System.out.println(6 + ": Synchronized block of class F " + i );

			}

		}

	}

}
