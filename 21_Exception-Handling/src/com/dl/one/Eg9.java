package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {
		//When both the catch and finally blocks use the return keyword then method will
		//return the finally block return value what so ever the  catch method return value is 
		System.out.println(sum());
	}
	@SuppressWarnings("finally")
	static String sum() {
		try {
			int i = 10;
			System.out.println(i);
			
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
			return "catch block";
			}
		finally {
			return "finally block";
			
		}

	}

}
