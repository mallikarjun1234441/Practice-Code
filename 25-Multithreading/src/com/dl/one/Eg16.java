package com.dl.one;

class C extends Thread{
	
	public void run() {
		
		for (int i = 0; i <6 ; i++) {
			System.out.println(i);
			
			}
	}
}
class D extends Thread{
	
	public void run() {
		
		for (int j = 0; j <6; j++) {
			System.out.println(j);
			
		}
	}
	
}
public class Eg16 {

	public static void main(String[] args) {
		Thread c = new C();
		Thread d = new D();
		
		c.setPriority(Thread.MAX_PRIORITY);
		d.setPriority(Thread.MAX_PRIORITY);
		
		c.start();
		d.start();
	
		
		
		
	}

}
