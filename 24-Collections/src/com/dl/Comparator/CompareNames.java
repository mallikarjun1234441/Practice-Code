package com.dl.Comparator;

import java.util.Comparator;

public class CompareNames implements Comparator<Employeee> {

	@Override
	public int compare(Employeee o1, Employeee o2) {
		
		return o1.name.compareTo(o2.name);
		
	}

	

	
}
