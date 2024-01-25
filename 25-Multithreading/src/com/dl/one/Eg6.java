package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getClass());
		System.out.println(t.getState());
        System.out.println(t.getPriority());
        
	}

}
