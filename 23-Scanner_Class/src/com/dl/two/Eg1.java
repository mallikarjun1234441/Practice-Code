package com.dl.two;

import java.io.Console;

public class Eg1 {

	public static void main(String[] args) {
		Console console = System.console();
		String userName = console.readLine("UserName: ");
		char[] password = console.readPassword("Password: ");
		String pass = String.valueOf(password);
		if(userName.equals("sai")&&pass.equals("kumar")) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Failure");
		}
           
		
		
	}
}
