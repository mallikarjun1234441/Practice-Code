package com.dl.seven;

//This keyword can be used to return current class instance
public class Product {
	public Product get() {
		Product p = new Product();
		return p;
		}
	public Product update() {
		return this;
		
	}
      
	public static void main(String[] args) {
		//Returns different objects
        Product product = new Product();
        System.out.println(product.get());
        System.out.println(product.get());
        System.out.println(product.get());
        System.out.println("              ");
        
        //Returns same objects
        System.out.println(product.update());
        System.out.println(product.update());
        System.out.println(product.update());
        
        
		
	}

}
