package com.Multiple.and.Multilevel;
interface MechanicalEngineering{
	public void Branch();
}
class College {
	public void Branch() {
		System.out.println("Student studing in the college "
				+ "Joginapally B.R. Engineering College");
	}
}
class Department extends College{
	public void Branch() {
		System.out.println("Department of Mechanical Engineering");
	}
}
 class Student extends Department implements MechanicalEngineering{
	public void Branch() {
		System.out.println("Candidate as a Student choosen the Mechanical"
				+ " Engineering in the college of JBREC ");
}
}
public class Eg3 {
	public static void main(String[] args) {
		College c = new College();
		c.Branch();
		Department d = new Department();
		d.Branch();
		Student st = new Student();
		st.Branch();
		
		
	}

}
