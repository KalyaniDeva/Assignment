package week3day1Assignment1;

public class AxisBank extends BankInfo{//Method Override Assignment: Class :AxisBank Methods :deposit()
	
	public void deposit() { //You have to override the method deposit in AxisBank.
		System.out.println("I have Deposite 9 Lakhs");
	}

	public static void main(String[] args) {
		BankInfo Data=new BankInfo();
		Data.savings();
		Data.fixed();
		Data.deposit();
	}
}
/*
 * Method Override Assignment:
 * 
 * Class :BankInfo Methods :saving(),fixed(),deposit()
 * 
 * Class :AxisBank Methods :deposit()
 * 
 * Description: You have to override the method deposit in AxisBank.
 */