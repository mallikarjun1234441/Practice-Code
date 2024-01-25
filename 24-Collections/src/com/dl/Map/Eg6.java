package com.dl.Map;

import java.util.LinkedHashMap;

public class Eg6 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(5, "NameFive");
		map.put(2, "NameTwo");
		map.put(4, "NameFour");
		map.put(3, "NameThree");
		map.put(1, "NameOne");
		map.put(4, "NameFourDuplicate");
		System.out.println(map);
		
		
	}
}
