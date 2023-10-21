package com.ThisKeywordCaseOne;

public class JoiningNewEmployee {
	String fName;
	String lName;
    String experience;
    String livingAddress;
    String proofOfAddress;
    long contactNo;
    int newEmployeeId;
    

	public JoiningNewEmployee(String fName, String lName, String experience, String livingAddress,
			String proofOfAddress, long contactNo, int newEmployeeId) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.experience = experience;
		this.livingAddress = livingAddress;
		this.proofOfAddress = proofOfAddress;
		this.contactNo = contactNo;
		this.newEmployeeId = newEmployeeId;
	}
	public void display() {
		System.out.println("First Name: " +fName);
		System.out.println("Last Name: " +lName);
		System.out.println("Experience: " +experience);
		System.out.println("Living Address: " +livingAddress);
		System.out.println("Proof of Address: " +proofOfAddress);
		System.out.println("Contact Number: " +contactNo);
		System.out.println("New Employee ID: " +newEmployeeId);
		}


	public static void main(String[] args) {
		JoiningNewEmployee joinnew = new JoiningNewEmployee("Mallikarjun", "Yalala", "Fresher", "Chitrapuri Colony", "Adhaar Card", 9177832353L, 4549);
		joinnew.display();
		

	}

}
