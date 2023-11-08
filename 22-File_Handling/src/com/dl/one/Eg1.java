package com.dl.one;

import java.io.File;
import java.io.IOException;


public class Eg1 {

	public static void main(String[] args) throws IOException {
		
	   //Two create File we use absolute and relative paths
	   //File created which is relative path
		File f1 = new File("cat.txt");
		boolean createnewFile = f1.createNewFile();
		System.out.println(createnewFile);
		System.out.println("File Created");
		
		
	}

}
