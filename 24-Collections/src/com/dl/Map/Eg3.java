package com.dl.Map;

import java.util.HashMap;
import java.util.Map;

public class Eg3 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(5, "NameFive");
		hashMap.put(4, "NameFour");
		System.out.println("Clear() method:" +hashMap);
		hashMap.put(1, "NameOne");
		hashMap.put(3, "NameThree");
		System.out.println(hashMap.size());
		hashMap.put(2, "NameTwo");
		hashMap.put(4, "NameFourDuplicate");
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		hashMap.remove(4);
		hashMap.put(null, "NullOne");
		hashMap.put(null, "NullTwo");//NullTwo Data overrides over the NullOne
		hashMap.put(6, null);
		hashMap.put(7, null);
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		hashMap.clear();
		
		
	}

}
