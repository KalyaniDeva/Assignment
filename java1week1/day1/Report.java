package java1week1.day1;

public class Report {

	public static void main(String[] args) {
		//create object for student class in main method 
		Student stu=new Student();//[Calling the variables from different class-Student)]
		//print all the variables
		
		System.out.println("Student Name: "+ stu.studentName);
		System.out.println("Student rollNumber: "+stu.rollNumber);
		System.out.println("Student collegeName: "+stu.collegeName);
		System.out.println("Student markScored: "+stu.markScored);
		System.out.println("Student cgpa: "+stu.cgpa);
	}
	

}
