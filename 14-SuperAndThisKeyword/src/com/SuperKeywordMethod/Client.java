package com.SuperKeywordMethod;

class A{
	public void m1() {
		System.out.println("M1 Method of A class");
	}
}
	class B extends A{
		public void m1() {
		super.m1();-
		System.out.println("M1 Method of B class");
		 
		}
		public void m2() {
		System.out.println("M2 Method of B class");
		}
	}
	

public class Client {

	public static void main(String[] args) {
         A a = new B();
         a.m1();
         B b = new B();
         b.m2();
        
	}

}
