package com.dl.one;

import java.io.File;
import java.io.FileOutputStream;

public class Eg7 {

	public static void main(String[] args) {
		File f = new File("one.txt");
		f.createNewFile();
		System.out.println("File Created");
		FileOutputStream stream = new FileOutputStream(f);
		String s1 = "Hello Java";
		byte[] bytes = s1.getBytes();
		stream.write(bytes);
		System.out.println("Data Inserted");
		stream.close();
		

	}

}
