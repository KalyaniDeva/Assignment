package week1day2Assignment2;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343; //Int num =34343
		int sum=0;     //Initialize a  temporary variable.
		//34343/10 3434  -3    343-4 
		int a=num; //Reverse the number (using for loop and add to the temporary variable)
		
		while(num>0){ 

			int res=num%10;
			 sum=(sum*10)+res;
			 //3+4+3+4+3
			 //0*10 +3=3  3*10+ 4=34  34*10+3= 343  343*10+4=3434  3434*10 +3=34343
			 
			//0+3 0+4 0+3 0+4 0+3
			num=num/10;
			//3434 343 34 3
	}
if(a==sum) { //Compare the temporary number with reversed number
	
	System.out.println(sum + " this is Palindrome" ); //If both numbers are same, print "palindrome number"
}
else {
	System.out.println(sum+ "this is not palindrome");
}
	
			
	}
		
}
