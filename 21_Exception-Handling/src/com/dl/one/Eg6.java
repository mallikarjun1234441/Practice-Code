package com.dl.one;

import java.io.File;
import java.io.IOException;

public class Eg6 {

	public static void main(String[] args) throws IOException  {
		File f = new File("Hello.txt");
		f.createNewFile();
	    System.out.println("New file created");
		

	}

}
