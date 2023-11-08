package com.dl.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg1 {

	public static void main(String[] args) throws IOException {
	   
	  System.out.println("Enter any number here: ");
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	   String readline = reader.readLine();
	   int parseint = Integer.parseInt(readline);
	   System.out.println("The entered number is: ");
	   System.out.println(parseint);
	   

	}

}
