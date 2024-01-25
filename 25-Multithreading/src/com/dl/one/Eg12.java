package com.dl.one;

public class Eg12 {

	public static void main(String[] args) { 

		Eg10 eg1 = new Eg10();
		Eg10 eg2 = new Eg10();
		Eg10 eg3 = new Eg10();
		
		System.out.println(eg1.getPriority());
		System.out.println(eg2.getPriority());
		System.out.println(eg3.getPriority());
		
		eg1.setPriority(10);
		eg2.setPriority(5);
		eg3.setPriority(8);
		
		System.out.println(eg1.getPriority());
		System.out.println(eg2.getPriority());
		System.out.println(eg3.getPriority());
		
	}

}
