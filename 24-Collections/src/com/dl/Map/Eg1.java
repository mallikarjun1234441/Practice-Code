package com.dl.Map;

import java.util.HashMap;

public class Eg1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(5, "NameFive");
		hashMap.put(4, "NameFour");
		hashMap.put(1, "NameOne");
		hashMap.put(3, "NameThree");
		hashMap.put(2, "NameTwo");
		hashMap.put(4, "NameFour");
		hashMap.put(null, "NullOne");
		hashMap.put(null, "NullTwo");//NullTwo Data overrides over the NullOne
		hashMap.put(6, null);
		hashMap.put(7, null);
		System.out.println(hashMap);
		
		
	}
}