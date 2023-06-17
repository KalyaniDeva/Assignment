package week1.day1;

public class NewMobile {
	public void sendSms() {
		System.out.println("Hello TestLeaf");

	}
protected void allowVoicecall() {
	System.out.println("abletoaccess");
	
}

private void takeVideo() {
	System.out.println("StartVideo");

}	
public static void main(String[] args) {
	NewMobile obj=new NewMobile();
	obj.sendSms();
	obj.allowVoicecall();
	obj.takeVideo();
	
}


}
