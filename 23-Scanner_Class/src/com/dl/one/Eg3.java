package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Product Type");
		String readline1 = reader.readLine();
		System.out.println("Product type:" +readline1);
		
		System.out.println("Product Brand");
		String readline2 = reader.readLine();
		System.out.println("Product Brand:" +readline2);
		
		System.out.println("Product: "+readline2+" "+readline1);
		reader.close();
		
		
		
	
		

	}

}
