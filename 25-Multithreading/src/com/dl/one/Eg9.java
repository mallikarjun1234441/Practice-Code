package com.dl.one;

public class Eg9 extends Thread{

	public static void main(String[] args) {
		//Customizing the thread name by using the setName()
		Eg9 eg9 = new Eg9();
		System.out.println(eg9.getName());
		eg9.setName("Hyderabad");
		System.out.println(eg9.getName());
         Eg9 eg5 = new Eg9();
         System.out.println(eg5.getName());
         eg5.setName("Noida");
         System.out.println(eg5.getName());
         Eg9 eg6 = new Eg9();
         System.out.println(eg6.getName());
         Eg9 eg7 = new Eg9();
         System.out.println(eg7.getName());
         
         
         
		
		
	}

}
