package org.student;

import org.college.College;

public class Student extends College{
	
	public void studentName() {
	System.out.println("Kavitha");	
	}
	public void studentDept() {
		System.out.println("EC");
	}
	public void studentId() {
		System.out.println("35");
	}
	public static void main(String[] args) {
		Student details=new Student();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		details.studentDept();
		details.studentId();
		details.studentName();
			}

}
