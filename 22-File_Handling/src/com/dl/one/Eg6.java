package com.dl.one;

import java.io.FileOutputStream;
import java.io.IOException;

public class Eg6 {

	public static void main(String[] args) throws IOException {
FileOutputStream fileoutputstream = new FileOutputStream("five.txt", true);
		
		String s2 = "Hello";
		
		byte[] bytes = s2.getBytes();
		
		fileoutputstream.write(bytes);  
	
		System.out.println("New file created and data inserted");
		
		fileoutputstream.close();

	}

}
