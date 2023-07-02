package week3.day1.Assignment1;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("Student Id: " + id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id & Name: " + id + "," + name);	
	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("Student email & phone number: " + email + "," + phonenumber);	
	}
	public static void main(String[] args) {
		Student detail=new Student();
		detail.getStudentInfo(32);
		detail.getStudentInfo(32, "Kalyani Deva");
		detail.getStudentInfo("Kalyani@gmail.com", 9242034345l);
	}

}

/*Assignment 4

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber*/
