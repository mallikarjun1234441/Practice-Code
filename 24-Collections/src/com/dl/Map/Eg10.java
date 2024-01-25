package com.dl.Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Eg10 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		String s1 = new String("a"); 
		hash.put(s1, 1);
		System.out.println(hash);
		
		s1 = null;
		System.gc();
		System.out.println(hash);
		
		WeakHashMap<String, Integer> weak = new WeakHashMap<String, Integer>();
		String s2 = new String("A"); 
		weak.put(s2, 1);
		System.out.println(weak);
		
		s2 = null;
		System.gc();
		System.out.println(weak);
		
		
		
		

		
	}

}
