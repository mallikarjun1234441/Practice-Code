package com.dl.one;

class A extends Thread{
	
	public void run() {
		
		for (int i = 6; i < 11; i++) {
			System.out.println("Thread A: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			}
		
	}
}

class B extends Thread{
	
	public void run() {
		
		for (int j = 1; j < 6; j++) {
			System.out.println("Thread B: "+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			}
	}
}

class E extends Thread{
	
	public void run() {
		
		for (int k = 11 ; k < 16; k++) {
			System.out.println("Thread E: "+k);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			}
	}
}

public class Eg15 {

	public static void main(String[] args) throws InterruptedException {
		Thread a = new A();
		Thread b = new B();
		Thread e = new E();
		
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(Thread.MIN_PRIORITY);
		e.setPriority(Thread.MAX_PRIORITY);
		b.start();
		b.join();
		a.start();
		a.join();
		e.start();
		e.join();
		
		System.out.println(a.getPriority());
		System.out.println(b.getPriority());
		System.out.println(e.getPriority());
		
		

	}

}
