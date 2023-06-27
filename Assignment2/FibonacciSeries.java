package week1.day2.Assignment2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci Series  example 8
		// 0,1,2,3,4,5,6,7,8 = 0, 0+1,1+1,1+2,2+3,5+3,8+5,13+8,21+13.
		// 0,1,1,2,3,5,8,13,21,34
		
		int num=8;
		int num1=0;
		int num2=1;
		
		for(int i=1; i<=8;i++) {
			// 1,2,3,4,5,6,7,8
			int sum =num1+num2;
		
		num1=num2;
		//1
		
		num2=sum;
		//1
		
		System.out.println(sum);
		
		}
	}

}
