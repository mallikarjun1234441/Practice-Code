package com.dl.one;

public class Eg8 {
	
 //Implementing try catch and finally block at a time 
//if there is something error in the try block the catch block will throw the exception
	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
			
		} 
		catch (Exception e) {
			System.out.println(e);
			
		} finally {
			System.out.println("Finally Block");
			
		}
		try {
			System.out.println("Try Block");
			
		} catch (Exception e) {
		System.out.println(e);
		}

		try {
			System.out.println("Try Block");
			
		} finally {
			System.out.println("Finally Block");
		}
		
	}

}
