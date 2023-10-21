package com.dl.one;

public class Eg2 {

	//Multiple  
	
	public static void main(String[] args) {
	
	    try {
	    	int a = 10;
	    	int b = 0;
	    	System.out.println(a/b);
	    	 
	    	int c[] = {10, 20, 30};
	    	System.out.println(c[3]);
	    	
	    	String s1 = "Ten";
	    	int parseInt = Integer.parseInt(s1);
			System.out.println(parseInt);
			
			String s3 = new String("Hello Java Hello Python");
			System.out.println(s3.charAt(49));
			System.out.println(s3.charAt(3));
			
			String s4 = null;
			System.out.println(s4.length());
			
			
		} catch (ArithmeticException e) {
			 System.out.println(e);
			 
		}
	    catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println(e);
	    	
		}
	    catch (NumberFormatException e) {
	    	System.out.println(e);
	    }
	    catch(StringIndexOutOfBoundsException e) {
	    System.out.println(e);
	    
	    }
	    catch (NullPointerException e) {
	    	System.out.println(e);
			
		}
	}

}
