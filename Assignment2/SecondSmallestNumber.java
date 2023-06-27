package week1.day2.Assignment2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// intialize the array
		int sum[]={23,45,67,32,89,22};
		System.out.println("Before sort : "+sum[1]);
		Arrays.sort(sum); // sort the array , 22,23,32,45,67
		
		System.out.println("After sort : "+sum[1]);
		
	}

}
