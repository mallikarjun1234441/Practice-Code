package com.dl.two;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg8 {

	public static void main(String[] args) throws IOException {
		//available();
	    FileInputStream file = new FileInputStream("five.txt");
	    System.out.println("Byte before reading: " + file.available());
	    file.read();
	    file.read();
	    System.out.println("Bytes availble remaing: " + file.available());
	    file.close();
	    

	}

}
