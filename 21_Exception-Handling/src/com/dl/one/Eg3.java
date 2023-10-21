package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		getCustName("Admin");}
		
	public static void getCustName(String name) {
		//Throw keyword allows us to throw checked or unchecked exception
		//Using the If else statement method to catch the exception it will make sure that the exception works correctly 
		
		if(name != "Author") {
		try {
			throw new Exception("The name is Mistake");
			
			
		} catch (Exception e) {
			System.out.println(e);
			}
	}
		else {
			System.out.println("Customer Name:- " +name);
		
		
		}	
		}}


