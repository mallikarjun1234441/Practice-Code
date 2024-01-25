package com.dl.Synchronization;

class Threadone extends Thread {
	//Non synchronized area
	public void m1() {
		for (int i = 1; i < 6; i++) {
			System.out.println(i + " :" + "Non Synchronized area");
//			System.out.println("Acitve Thread count: "+Thread.activeCount());
		       
		}
		//Synchronized block
		synchronized (this) {
			for (int i = 6; i < 10; i++) {
				System.out.println(i+ " :" + "Synchronized block");
			}
		}
		System.out.println("Non Synchornized area");
//		System.out.println("Acitve Thread count: "+Thread.activeCount());
	       
	}
}

public class Test extends Thread {
	Threadone one;

	public Test(Threadone one) {
		this.one = one;
	}
	public void run() {
		one.m1();
//		System.out.println("Acitve Thread count: "+Thread.activeCount());
	       
	}
	
	
	public static void main(String[] args) {

		Threadone t1 = new Threadone();
		Test test = new Test(t1);
		test.start();
//		System.out.println("Acitve Thread count: "+Thread.activeCount());
       
		
	}
}
