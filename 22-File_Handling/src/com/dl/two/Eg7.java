package com.dl.two;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg7 {

	public static void main(String[] args) throws IOException {
		
		//available method() to check the no of available bytes in the FileInputStream
		//read method will read the 1byte at one call
        
		FileInputStream stream = new FileInputStream("lovelyNature.txt");
      
        System.out.println("Bytes before read: " +stream.available());
        //reads 4 bytes from the file
        stream.read();
        stream.read();
        stream.read();
        stream.read();
        //returns the number of remaining available bytes 
        System.out.println("Bytes After read: " +stream.available());
        stream.close();
        }
	 

}
