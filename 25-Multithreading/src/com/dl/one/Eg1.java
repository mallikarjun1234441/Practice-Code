package com.dl.one;

import java.io.File;
import java.io.IOException;

public class Eg1 {
	
    public static void main(String[] args) throws IOException {
		
    	File f1 = new File("Multi-Threading notes");
    	boolean createNewFile = f1.createNewFile();
    	System.out.println(createNewFile);
    	System.out.println("File created");
	}

}
