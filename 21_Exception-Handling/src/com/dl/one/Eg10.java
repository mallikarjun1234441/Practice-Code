package com.dl.one;

public class Eg10 {

	public static void main(String[] args) {
		//When the try and finally blocks both use the return method 
		//then the method will return the return value of the finally block
		//instead of return value of the catch method
	System.out.println(sum());
	}
	
	@SuppressWarnings("finally")
	static String sum() {
		
		try {
			int i = 10;
			System.out.println(i);
			return "Try Block";
			
			
		} finally {
			return "Finally Block";
			
			
		}

	}

}
