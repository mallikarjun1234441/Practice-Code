package com.dl.one;

public class Eg13 {

	public static void main(String[] args) {
		// infinite for loop for try block
		
		try {
			for(;;) {
				System.out.println("In the try block with infine for loop");
			}
			
		} finally {
			System.out.println("finally block executed");
		}
	}

}
