package com.dl.four;

//this() constructor is used to invoke current class constructor
public class Student {
	public Student(){
		this(101);
		System.out.println("Default student constructor");
		}
	
	public Student(int Id){
		
		System.out.println("Student Identity: " +Id);
	}

	public static void main(String[] args) {
           
		new Student();
		
		
	}

}
