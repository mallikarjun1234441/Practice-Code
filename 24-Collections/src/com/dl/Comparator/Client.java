package com.dl.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		
		Employeee emp1 = new Employeee(4, "A");
		Employeee emp2 = new Employeee(5, "C");
		Employeee emp3 = new Employeee(1, "B");
		Employeee emp4 = new Employeee(2, "E");
		Employeee emp5 = new Employeee(3, "D");
		ArrayList<Employeee> list = new ArrayList<Employeee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		System.out.println(list);
		Collections.sort(list, new CompareId());
		System.out.println("Id's Ascending order by using sort method: " +list);
		Collections.sort(list, new CompareNames());
		System.out.println("Names in Ascending order by using sort method: " +list);
		

	}

}
