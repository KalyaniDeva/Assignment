package week1.day2.Assignment2;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int sum=0;
		//34343/10 3434  -3    343-4 
		int a=num;
		
		while(num>0){
			int res=num%10;
			 sum=(sum*10)+res;
			 //3+4+3+4+3
			 //0*10 +3=3  3*10+ 4=34  34*10+3= 343  343*10+4=3434  3434*10 +3=34343
			 
			//0+3 0+4 0+3 0+4 0+3
			num=num/10;
			//3434 343 34 3
	}
if(a==sum) {
	
	System.out.println(sum + " this is Palindrome" );
}
else {
	System.out.println(sum+ "this is not palindrome");
}
	
			
	}
		
}
