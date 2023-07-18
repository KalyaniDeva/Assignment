package week3day1Assignment1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("I have Deposite 9 Lakhs");
	}

	public static void main(String[] args) {
		BankInfo Data=new BankInfo();
		Data.savings();
		Data.fixed();
		Data.deposit();
	}
}
