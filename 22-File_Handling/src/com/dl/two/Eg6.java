package com.dl.two;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg6 {

	public static void main(String[] args) throws IOException {
		FileInputStream inputreader = new FileInputStream("five.txt");
		int i;
		while ((i=inputreader.read())!= -1) {
			System.out.print((char)i);
			
		}
		inputreader.close();

	}

}
