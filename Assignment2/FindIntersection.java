package week1.day2.Assignment2;


public class FindIntersection {

	public static void main(String[] args) {
		
		
		int number[] = {3,2,11,4,6};
		int num1[] = {1,2,8,4,9,7};
		
		for(int i=0; i<number.length; i++){
			
			for(int j=0; j<num1.length; j++){
				
				if (number[i]==num1[j]){
					
					System.out.println(+num1[j]);
				}
				
			}

		}
	}
}
