package com.dl.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Car vehicle showroom");
		
		System.out.println("Customer: What is the price of an entry level vehicle ?");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String readline = reader.readLine();
		
		int parseint = Integer.parseInt(readline);
		
		System.out.println("Sales Man: An entry level vehicle price in this showroom is Rs" + parseint +"/-");
		
	

		
	}

}
