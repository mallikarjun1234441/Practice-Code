package com.dl.Map;

import java.util.HashMap;

public class Eg2 {

	public static void main(String[] args) {
		//hashMap class from the Map interface
		
		//put method in the hashMap class in the map
		
		//In hashMap, If passing null in the value place it will allowed multiple times
		//null in the key place allowed only once
		//If modifying the existing key will override the data
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "NameOne");
		hashMap.put(2, "NameTwo");
		hashMap.put(2, "NameThree");//Data overrides in the 2nd key-value
		hashMap.put(4, null);
		hashMap.put(5, null);
		System.out.println(hashMap);
		
		
		
		  
		
	}
}
