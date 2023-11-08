package com.dl.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("First name");
		String readLine2 = reader.readLine(); 
		
		
		System.out.println("Your last name");

		
		int read = reader.read();
		
		System.out.println(readLine2);
		   
		
		System.out.println((char)read);
		
		
		
		
		
		
	
		
		
		
	    

	}

}
