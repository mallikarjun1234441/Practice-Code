package com.dl.one;

public class Eg14 extends Thread {

	//In this example for each and every consecutive same set of digits the 
	//thread will sleep for two seconds and then starts again by using the 
	//sleep() method this function can be implemented.
	//join() method will wait the thread until the another thread will completes
	//its execution.
	public static void main(String[] args) throws InterruptedException {
		Eg14 eg14 = new Eg14();
		Thread t1 = new Thread(eg14);
		t1.start();
		t1.join();
		
		
		Thread t2 = new Thread(eg14);
		t2.start();
		t2.join();
		
		
		Thread t3 = new Thread(eg14);
		t3.start();
		t3.join();
		
	}
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}

}
