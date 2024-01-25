package com.dl.InterThread;

public class E implements Runnable {

	@Override
	public void run() {
		System.out.println(4+ ": Run method of Class E non synchronized");

		synchronized (this) {
			for (int i = 0; i < 6; i++) {
				System.out.println(5+ ": Synchronized block and class E "+ i);

			}
			notify();
		}
	}

}
