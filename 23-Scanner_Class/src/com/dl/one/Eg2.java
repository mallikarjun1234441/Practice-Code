package com.dl.one;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product Id no:");
       
        int productno = sc.nextInt();
        
        System.out.println("Product ID:" +productno);
       
        System.out.println("Enter product Brand:");
        
        String productBrand = sc.next();
        
        System.out.println("Product Brand:" +productBrand);
        
        System.out.println("Enter product Type:");
        
        String productType = sc.next();
        
        System.out.println("Product Type:" +productType);
        
        System.out.println("Enter product Model no:");
        
        String modelName = sc.next();
        
        System.out.println("Model:" +modelName);
        
        System.out.println("Enter Product cost");
        
        double productCost = sc.nextDouble();
        
        System.out.println("Product Cost:- " +productCost+ "/-");
        
        System.out.println("Mobile Cost: "+productCost+ "/-");
        
        sc.close();
          
	}

}
