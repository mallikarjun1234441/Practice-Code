package com.dl.one;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		
		System.out.println("What is your full name?");
		
		Scanner scanner = new Scanner(System.in);
		//Read the first token
		String firstName = scanner.next();
		//Read the second token
		String lastName = scanner.next();
		//Print the token values read by scanner objects
		System.out.println("First Name: "+ firstName);
		System.out.println("Last Name: "+ lastName);
		System.out.println(firstName +" "+ lastName + " is a good Name");
		scanner.close();
		
		

	}

}
