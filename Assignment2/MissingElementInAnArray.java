package week1.day2.Assignment2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int num[] = { 1, 4, 5, 7, 8 ,2 ,3,10 };				
		
		Arrays.sort(num);
		
		//array value after sort 1,2,3,4,5,7,8

		//iterate 1,2,3,4,5,6,7,8
		for(int i=1; i<num.length;i++) {
			
			if (i!=num[i-1]) {
				//(index != array index.value)
				//(1!=1)
				//(2!=2)(3!-3)(4!=4)(5!=5)(6!=7)
				System.out.println(i);
				break;
				
			}
				
		}
	}

}

	
