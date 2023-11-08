package com.dl.one;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Eg4 {

	public static void main(String[] args) throws IOException {
		
		//Character Oriented Stream 
		FileWriter filewriter = new FileWriter("C:\\Users\\ymall\\eclipse-workspace\\File_Handling\\camel.txt");
		
		filewriter.write("Hello Java and Hello Python");
		
		filewriter.close();
		
		System.out.println("File created and data inserted successfully");
		
		
		
		//Byte Oriented Stream		
		FileOutputStream fileoutputstream = new FileOutputStream("two.txt", true);
		
		String s1 = "Hi";
		
		byte[] bytes = s1.getBytes();
		
		fileoutputstream.write(bytes);
	
		System.out.println("New file created and data inserted");
		
		fileoutputstream.close();
		
		

		
		
		
		
		
		
		
		
		
		
		

	}

}
