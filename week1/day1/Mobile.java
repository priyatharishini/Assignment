package week1.day1;

public class Mobile {

	public void sendSms()
	{
		String mobileModel="vivo";
		float  mobileWeight = 10.00f;
		System.out.println("From oppo");
		//System.out.println("mobile model " +mobileModel);
		//System.out.println("mobile weight "+mobileWeight);		
		
	}
	public void makeCall()
	{
		boolean isFullCharged=true;
		int mobileCost=10000;
		System.out.println("Calling my Friend");
		//System.out.println("It is fully charged "+isFullCharged);
		//System.out.println("Mobile cost "+mobileCost);
		
	}
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		System.out.println("This is my mobile");
		mob.sendSms();
		 mob.makeCall();

	}

}
