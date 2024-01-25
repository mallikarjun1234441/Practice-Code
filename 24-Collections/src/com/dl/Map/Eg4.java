package com.dl.Map;

import java.util.HashMap;

public class Eg4 {
	
	 public static void main(String[] args) {
	
		 HashMap<Integer, String> hash = new HashMap<Integer, String>();
		 hash.put(1, "Mallikarjun");
		 hash.put(2, "Vaishnavi");
		 hash.put(3, "Amulya");
		 hash.put(4, "Paramesh");
		 hash.put(5, "Kalpana");
		 hash.put(6, "Mannemma");
		 hash.put(7, "Mallingam");
		 hash.put(8, "Bodilingam");
		 System.out.println(hash);
		 hash.remove(8);
		 System.out.println(hash);
		 System.out.println(hash.size());
		 hash.clear();
		 System.out.println(hash);
		
		 
		 
	}

}
