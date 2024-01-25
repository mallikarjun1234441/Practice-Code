package com.dl.Comparator;

import java.util.Comparator;

public class CompareId implements Comparator<Employeee> {

	@Override
	public int compare(Employeee o1, Employeee o2) {
		Integer i = o1.id;
		
		return i.compareTo(o2.id);
		
	}

	

}
