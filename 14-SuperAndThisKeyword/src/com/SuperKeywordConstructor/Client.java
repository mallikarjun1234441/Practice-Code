package com.SuperKeywordConstructor;

class A{
	public A() {
		System.out.println("Default Constructor of class A");
		
	}
	public A(int i, int j) {
		this();
		System.out.println(i+j);
		
	}
}
class B extends A{
	public B() {
		super(10, 20);
	    System.out.println("Default constructor of class B");
	}
}
public class Client {

	public static void main(String[] args) {
		new B();
		
		

	}

}
