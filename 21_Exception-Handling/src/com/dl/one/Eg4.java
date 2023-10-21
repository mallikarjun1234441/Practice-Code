package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		getcustName("Mallikarjun");}
	
	public static void getcustName(String name) {
		if(name != "Malli") {
			try {
				 throw new Exception("The User Defined Excpetion");
				
			} catch (Exception e) {
				System.out.println(e);
				
			}}
			else {
				System.out.println(name);
			}
		}
		
	}


