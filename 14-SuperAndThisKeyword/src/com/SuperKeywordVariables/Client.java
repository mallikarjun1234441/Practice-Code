package com.SuperKeywordVariables;

class A {
	int i = 10;
	int j= 20;
} 
	class B extends A{
		int i = 100;
		int j = 200;
		
		public B (int i, int j) {
			System.out.println("Local Variable: " + i+ "  " +j);
			System.out.println("Instance Variables current class: " +this.i+"  "+this.j);
			System.out.println("Instance Variables super class: " +super.i+ "  "+super.j);
		
	}	}
public class Client{
	public static void main(String[] args) {
		new B(1000, 2000); 
	}

}
