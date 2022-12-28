package test1;

public class Mobile {
	public void makeCall() {
		String mobileModel = "Apple11";
		float mobileWeight = 4.555558f;
		System.out.println("Make a call to my number"+mobileModel+mobileWeight);
		

	}
	public void sendMsg() {
		boolean fullCharged = false;
		int mobileCost = 20000;
		System.out.println("Send an SOS message"+fullCharged+mobileCost);
		
		
		

	}
	public static void main(String[] args) {
		System.out.println("This is my mobile");
		Mobile po= new Mobile();
		po.sendMsg();
		po.makeCall();
	}

}
