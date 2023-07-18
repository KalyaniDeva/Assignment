package week1day2Assignment2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {

		int sum[]={23,45,67,32,89,22}; 		// intialize the array
		System.out.println("Before sort : "+sum[1]);// before sort print array
		Arrays.sort(sum); 					// sort the array , 22,23,32,45,67
		
		System.out.println("After sort : "+sum[1]); // before sort print array
		
	}

}
