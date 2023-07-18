package week1.day2Assignment2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci Series  example 8
		// 0,1,2,3,4,5,6,7,8 = 0, 0+1,1+1,1+2,2+3,5+3,8+5,13+8,21+13.
		// 0,1,1,2,3,5,8,13,21,34
		
		int num=8;
		int num1=0;
		int num2=1;	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		System.out.println("First number is " +num1);            // Print first number
		
		for(int i=1; i<=8;i++) {		// Iterate from 1 to the range

			// 1,2,3,4,5,6,7,8
		int sum =num1+num2; 		// add first and second number assign to sum

		
		num1=num2;		// Assign second number to the first number
		//1
		
		num2=sum;		// Assign sum to the second number
		//1
		
		System.out.println(sum); 		// print sum
		
		}
	}

}
