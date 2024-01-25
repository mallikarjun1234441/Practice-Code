package com.dl.Map;

import java.util.Map;
import java.util.TreeMap;

public class Eg8 {

	public static void main(String[] args) {

		
		//Multiple nulls are allowed in the TreeMap class
		//null keys are not allowed in TreeMap
		Map<Integer, String> tree = new TreeMap<Integer, String>();
		tree.put(2, "NameTwo");
		tree.put(1, "NameOne");
//		tree.put(null, null);
		tree.put(3, null);
		tree.put(4, "NameFour");
		tree.put(5, "NameFive");
		tree.put(6, null);
		System.out.println(tree);
		
		
		
	}

}
