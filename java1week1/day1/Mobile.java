package java1week1.day1;

public class Mobile {
	//Create 2 methods (makeCall() , sendMsg()) with simple print statement
	public void makeCall() 
	{
	//In first method create variable  mobileModel (String),mobileWeight (float)
		String mobileModel="Samsung"; 
		float mobileWeight=8.567f;
		System.out.println("mobileModel: " + mobileModel);
		System.out.println("mobileWeight: " + mobileWeight);
			}

public void sendMsg() 
			{
	//In second method create variable  isFullCharged (boolean),mobileCost (int)
		boolean isFullCharged=true;
		int mobileCost=30000;
		System.out.println("isFullcharged: " + isFullCharged);
		System.out.println("mobileCost: " + mobileCost);
			}

	public static void main(String[] args) { //Create main method
		
		//Create object for class and call  from main method and print them

		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my mobile"); //print a statement---->"This is my mobile";
	}
}
