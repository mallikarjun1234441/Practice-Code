package com.dl.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("First Name:");
		String readLine = reader.readLine();
		
		
		System.out.println("Last Name");
		
		int read = reader.read();
		System.out.println(readLine);
		System.out.println((char)read);
		
	}

}
