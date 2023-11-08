package com.dl.one;

import java.io.File;
import java.io.IOException;

public class Eg3 {

	

	public static void main(String[] args) throws IOException {
		 
		//Relative to the  path
		File f1 = new File("Spring");
		boolean mkdir = f1.mkdir();
		System.out.println(mkdir);
		
		//Absolute path
		File f3 = new File("C:\\Users\\ymall\\eclipse-workspace\\File_Handling\\src\\com\\dl\\one\\dog3");
		boolean mkdir2 = f3.mkdir();
		System.out.println(mkdir2);
		
		//creating multiple directory
		File f4 = new File("C:\\Users\\ymall\\Absolute path example\\core java example//just practice//Eg3");
		boolean mkdirs3 = f4.mkdirs();
		System.out.println(mkdirs3);
		
		//File not created if the path taken from the example
//		File f5 = new File("C:\\Users\\ymall\\Absolute path example\\core java example//just practice//Eg3");
//		boolean createNewFile1 = f5.createNewFile();
//		System.out.println(createNewFile1);
		
		File f5 = new File("C:\\Users\\ymall\\eclipse-workspace\\File_Handling\\src\\com\\dl\\one\\Animal\\mother dog\\puppy\\just born");
		boolean mkdirs4 = f5.mkdirs();
		System.out.println(mkdirs4);
		
		File f6 = new File("C:\\Users\\ymall\\eclipse-workspace\\File_Handling\\src\\com\\dl\\one\\Animal\\mother dog\\puppy\\just born\\baby dog.txt");
		boolean c6 = f6.createNewFile();
		System.out.println(c6);
		

	}

}
