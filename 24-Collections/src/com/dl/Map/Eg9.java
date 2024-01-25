package com.dl.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
public class Eg9 {

	public static void main(String[] args) {
		
		String s1 = new String("a");
		String s2 = new String("a");
		HashMap<String, String> hash = new HashMap<String, String>();
		//It uses the hashCode() method to get the hashCode
		hash.put(s1, "A");
		hash.put(s2,"B");
		System.out.println(hash);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
		
	     //IdentityHashMap class 
		//It will not override the duplicate values if there are the duplicate values present in the data set
        //It uses the System.identityHashCode() method to get the hashCode
        IdentityHashMap<String, String> im = new IdentityHashMap<String, String>();
		im.put(s1, "A");
		im.put(s2, "B");
		System.out.println("  ");
		System.out.println(im);//Duplicate values will not override
//		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
		
		
		

	}

}
