package com.dl.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Eg5 {

	public static void main(String[] args) {
		
		
		//Values method and KeySet method
		//KeySet method will print the the keys of the map in alignment
		//Values method will print the values of map in the aligned manner
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Core Java");
		hash.put(2, "Adv Java");
		hash.put(3, "Hibernate");
		hash.put(5, "Rest");
	    hash.put(4, "Spring");	
	    System.out.println(hash);
	    Collection<String> values = hash.values();
	    System.out.println(values);
	    
	    Set<Integer> keySet = hash.keySet();
	    System.out.println(keySet);
	    
	    
	}
}
