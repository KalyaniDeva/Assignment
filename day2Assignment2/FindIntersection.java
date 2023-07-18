package week1.day2Assignment2;


public class FindIntersection {

	public static void main(String[] args) {
		
		
		int number[] = {3,2,11,4,6}; // a) Declare An array for {3,2,11,4,6,7};
		int num1[] = {1,2,8,4,9,7};	//b) Declare another array for {1,2,8,4,9,7};
		
		for(int i=0; i<number.length; i++){ //c) Declare for loop iterator from 0 to array length
			
			for(int j=0; j<num1.length; j++){ // d) Declare a nested for another array from 0 to array length
				
				if (number[i]==num1[j]){ // e) Compare Both the arrays using a condition statement
					
					System.out.println(+number[i]); // f) Print the first array (should match item in both arrays)
				}
				
			}

		}
	}
}

	 
 
 


 

 