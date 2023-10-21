package com.dl.one;

public class Eg12 {

	public static void main(String[] args) {
		//finally is not executed if System.exit is used
		try {
			System.out.println("try block");
			System.exit(0);
		} finally {
			System.out.println("finally block is executed");
			
		}

	}

}
