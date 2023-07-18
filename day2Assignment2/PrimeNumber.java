package week1.day2Assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=13;		// Declare an int Input and assign a value 13
		boolean flag=false;			// Declare a boolean variable flag as false
		//13/2, 13/3, 13/4 ... 13/12 
		
		for(int i=2;i<number;i++) {		// Iterate from 2 to half of the input
			if (number%i==0) { 			// Divide the input with each for loop variable and check the remainder
				flag=true;			// Set the flag as true when there is no remainder
				break;							// break the iterator

			}
			
		}

		if(!flag) {// flag = false 		// Check the flag (Provide a condition)
			System.out.println("The given number is prime number");			// Print 'Prime' when the condition matches
		}
		else
			System.out.println("The given number is not a prime number"); 	// Print 'Not a Prime' when the condition doesn't match 
		
		
	}
	

}
