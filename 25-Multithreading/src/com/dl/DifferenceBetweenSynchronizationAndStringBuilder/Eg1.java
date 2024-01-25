package com.dl.DifferenceBetweenSynchronizationAndStringBuilder;

class A extends Thread {
	public synchronized void m1() {

		for (int i = 0; i < 6; i++) {
			System.out.println(i + Thread.currentThread().getName());

		}

	}
}

class B extends Thread {
	A a;

	public B(A a) {
		this.a = a;

	}

	public void run() {
		a.m1();

	}

}

class C extends Thread {
	A a;

	public C(A a) {
		this.a = a;
	}

	public void run() {
		a.m1();
	}

}

class D extends Thread {
	A a;

	public D(A a) {
		this.a = a;
	}

	public void run() {
		a.m1();
	}
}

public class Eg1 extends Thread {
	A a;

	public Eg1(A a) {
		this.a = a;
	}

	public void run() {
		a.m1();
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
