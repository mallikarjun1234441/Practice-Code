package com.ThisKeywordCaseOne;

//If we use same variable as the instance variable and in the parameters has effect by using the this keyword
public class CreateAccount {
	int userId;
    String fName;
    String lName;
    String email;
    long contactNo;
    String experience;
    
    
    public CreateAccount(int userId, String fName, String lName, String email, long contactNo, String experience) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.contactNo = contactNo;
		this.experience = experience;
		}
	public void display() {
		System.out.println(userId);
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(email);
		System.out.println(contactNo);
		System.out.println(experience);
		}
	
	public static void main (String [] args) {
		 CreateAccount create = new CreateAccount(6556454, "Sai", "Kumar", "ymallikarjun299@gmail.com", 65498454L, "Five Years experience");
		 create.display();
		
	}

}
