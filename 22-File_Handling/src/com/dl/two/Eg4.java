package com.dl.two;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream("lovelyNature.txt");
		
		int i;
		while((i=fileInput.read())!= -1) {
			System.out.print((char)i);
		}
		
		
	   fileInput.close();
	}

}
