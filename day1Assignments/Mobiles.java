package week1.day1Assignments;

public class Mobiles {
	String mobilemodel="Samsung";
	float mobileweight=10.50f;
	Boolean fullycharged=true ;
	int mobilecost=10000 ;
		
	
	public void makecall() {
		System.out.println("Call ringing");
	}
	public void sendsms() {
		System.out.println("sms sent");

	}


public static void main(String[] args) {
    Mobiles details=new Mobiles();
	details.makecall();
	details.sendsms();
	System.out.println(details.mobilemodel);
	System.out.println(details.mobileweight);
	System.out.println(details.fullycharged);
	System.out.println(details.mobilecost);
	System.out.println("This is my mobile");
}
}
