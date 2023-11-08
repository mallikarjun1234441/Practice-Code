package com.dl.one;

import java.io.File;
import java.io.IOException;

public class Eg2 {

	public static void main(String[] args) throws IOException {
		//Relative to the path
		//File created which is relative to the path Jvm will check the current existing path
		  File f2 = new File("file.txt");
		  boolean createNewFile = f2.createNewFile();
		  System.out.println(createNewFile);
		  System.out.println("File Created");
		
		  File f3 = new File("src/ball.txt");
		  boolean createNewFile1 = f3.createNewFile();
		  System.out.println(createNewFile1);
		  System.out.println("File Created");
		  
		  //Absolute path
		  File f4 = new File("C:\\Users\\ymall\\eclipse-workspace\\File_Handling\\src\\com\\dl\\one\\dog.txt");
		  boolean createNewFile2 = f4.createNewFile();
		  System.out.println(createNewFile2);
		  System.out.println("File Created");
		  
		  
		 
		


		  
	}

}
