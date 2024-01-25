package com.dl.DifferenceBetweenSynchronizationAndStringBuilder;

public class Eg2 {

	public static void main(String[] args) {
		StringBuilder s4 = new StringBuilder("java");
		StringBuilder s5 = s4.append("Python");
		StringBuilder s6 = s5.append("JavaScript");
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		

	}

}
