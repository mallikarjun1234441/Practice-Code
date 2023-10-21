package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		getCustName1("Mallikarjun");}
	
    public static void getCustName1(String name) {
    	if(name != "Mallikarjun") {
    		try {
    			throw new Exception("The User defined Exception");
    			
				
			} catch (Exception e) {
				System.out.println(e);
				
			}
    		
    	}
    	else {
			System.out.println("The give name of the customer is " +name);
		}
		
	}
		
}

	


