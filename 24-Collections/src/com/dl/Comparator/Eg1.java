package com.dl.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employeeee implements Comparator<Employeeee>{
    int Id;
	String name;
	
	
	public Employeeee(int id, String name) {
		Id = id;
		this.name = name;
	}


	public Employeeee() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employeeee [Id=" + Id + ", name=" + name + "]";
	}


	@Override
	public int compare(Employeeee o1, Employeeee o2) {
		
		return o1.name.compareTo(o2.name);
//		return o2.name.compareTo(o2.name);
			}
}

public class Eg1 {
	
	public static void main(String[] args) {
		
		Employeee emp1 = new Employeee(3, "C");
		Employeee emp2 = new Employeee(1, "D");
		Employeee emp3 = new Employeee(2, "A");
		Employeee emp4 = new Employeee(4, "B");
		
		ArrayList<Employeee> list = new ArrayList<Employeee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println(list);
		
//		Collections.sort(list, new Employeee());
//		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		
		
	}
	
	
}