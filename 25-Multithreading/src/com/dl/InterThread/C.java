package com.dl.InterThread;

public class C implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method and non synchronized method of class"
				+ "C");
		
		synchronized (this) {
			for (int i = 0; i < 6; i++) {
				System.out.println(i+ ": Synchronized block of class C in run"
						+ "method");
				}
			notify();
		}
		
	}
	
	

}
