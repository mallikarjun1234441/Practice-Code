package com.dl.two;

import java.io.FileReader;
import java.io.IOException;

public class Eg5 {

	public static void main(String[] args) throws IOException {
		
	 FileReader reader = new FileReader("five.txt");
	 int i;
	 while((i=reader.read())!= -1) {
	 System.out.print((char)i);
	 
	
	 }
	 reader.close();

	}

}
