package week1.day2.Assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=12;
		boolean flag=false;
		//13/2, 13/3, 13/4 ... 13/12 
		for(int i=2;i<number;i++) {
			if (number%i==0) {
				flag=true;
			}
			
		}

		if(!flag) {// flag = false
			System.out.println("The given number is prime number");
		}
		else
			System.out.println("The given number is not a prime number");
		
		
	}
	

}
