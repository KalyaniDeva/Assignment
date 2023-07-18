package week1.day2Assignment2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int num[] = { 1, 4, 5, 7, 8 ,2 ,3,10 };	 			
		
		Arrays.sort(num);// Sort the array	

		
		//array value after sort 1,2,3,4,5,7,8

		//iterate 1,2,3,4,5,6,7,8
		for(int i=1; i<num.length;i++) { // loop through the array (start i from arr[0] till the length of the array)
			
			if (i!=num[i-1]) { //check if the iterator variable is not equal to the array values respectively
				//(index != array index.value)
				//(1!=1)
				//(2!=2)(3!-3)(4!=4)(5!=5)(6!=7)
				System.out.println(i); 			// print the number
				break; 							// once printed break the iteration
				
			}
				
		}
	}
}