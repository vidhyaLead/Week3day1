package org.student;

import org.dept.department;

public class student extends department {
	public void stuName() {
		System.out.println("Siva");	
	}
	public void stuDept() {
		System.out.println("Computer Science");
	}
	public void stuID() {

		System.out.println("Stu id is 15755");
	}
	public static void main(String[] args) {
		student s1 = new student();
		s1.collegeCode();
		s1.collegeName();
		s1.collegeRank();
		s1.dept();
		s1.stuName();
		s1.stuID();
		s1.stuDept();


	}

}
