package com.dl.one;

import java.io.FileReader;
import java.io.IOException;

public class Eg8 {

	public static void main(String[] args) throws IOException {
		FileReader filereader = new FileReader("six.txt");
		int i;
		while((i=filereader.read())!= -1) {
		System.out.print((char)i);
		}
		filereader.close();
	
}}
	


