package com.dl.Synchronization;

class A {
//Synchronized Method
	public synchronized void m1() throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			System.out.println(i + ":" + Thread.currentThread().getName());

			Thread.sleep(1000);

		}

	}
}

class B extends Thread {
	A a;

	public B(A a) {
		this.a = a;
	}

	public void run() {
		try {
			a.m1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class C extends Thread {

	A a;

	public C(A a) {
		this.a = a;
	}

	public void run() {
		try {
			a.m1();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}

class D extends Thread {
	A a;

	public D(A a) {
		this.a = a;

	}

	public void run() {
		try {
			a.m1();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}

public class Client extends Thread {
	A a;

	public Client(A a) {
		this.a = a;
	}

	public void run() {
		try {
			a.m1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B(a);
		C c = new C(a);
		D d = new D(a);
		b.start();
		b.join();
		c.start();
		c.join();
		d.start();
		d.join();

	}

}
