package org.student;//MULTILEVEL INHERITANCE Package :org.student 

import org.college.College; 

public class Student extends College{//Class :Student Methods :studentName(),studentDept(),studentId()
	
	public void studentName() {
	System.out.println("Kavitha");	
	}
	public void studentDept() {
		System.out.println("EC");
	}
	public void studentId() {
		System.out.println("35");
	}
	public static void main(String[] args) { //create above 3 class and call all your class methods into the Student using multilevel inheritance.
		Student details=new Student();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		details.studentDept();
		details.studentId();
		details.studentName();
			}

}
/*
 * Package :org.college Class :College Methods
 * :collegeName(),collegeCode(),collegeRank()
 * 
 * Package :org.department Class :Department Methods :deptName()
 * 
 * Package :org.student Class :Student Methods
 * :studentName(),studentDept(),studentId()
 * 
 * Description: create above 3 class and call all your class methods into the
 * Student using multilevel inheritance.
 */