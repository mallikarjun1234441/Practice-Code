package com.dl.InterThread;

public class B implements Runnable {

	@Override
	public void run() {
		System.out.println("Run method of class B");

		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + ": Class B synchronized area for loop");
                
			}
			notify();

		}
	}

}

