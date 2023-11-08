package com.dl.two;

import java.io.FileWriter;
import java.io.IOException;

public class Eg1 {

	public static void main(String[] args) throws IOException {
		FileWriter filewriter = new FileWriter("Kunfu.txt");
		
		filewriter.write("Practicing the file handling");

		System.out.println("successfully created the file the and inserted the data");
	
		filewriter.close();
	}

}
