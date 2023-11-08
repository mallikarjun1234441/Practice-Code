package com.dl.two;

import java.io.FileOutputStream;
import java.io.IOException;

public class Eg3 {

	public static void main(String[] args) throws IOException {
	
	FileOutputStream fileOut = new FileOutputStream("lovelyNature.txt");
	
	String s3 = "The mother nature has the power to make the world beauty";
	
	byte[] b = s3.getBytes();
	
	fileOut.write(b);
	
	System.out.println("File created and the data inserted successfully");
	
	fileOut.close();
	

	}


}
