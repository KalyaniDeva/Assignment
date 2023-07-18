package org.college;//MULTILEVEL INHERITANCE Package :org.college 

import org.department.Department; 

public class College extends Department{ //Class :College Methods:collegeName(),collegeCode(),collegeRank()
	
	public void collegeName() {
		System.out.println("Thiyagarajar Engineering College");
		
	}
	public void collegeCode() {
	System.out.println("165");
}
	public void collegeRank() {
		System.out.println("First");
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