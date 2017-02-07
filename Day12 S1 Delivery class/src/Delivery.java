
public class Delivery {
	long	over;
	long	ball;
	long	runs;
	String	batsman;
	String	bowler;
	String	nonStriker;

	public void displayDeliveryDetails()
	{
		System.out.println("Delivery Details :");
		System.out.println("Over : "+this.over);
		System.out.println("Ball : "+this.ball);
		System.out.println("Runs : "+this.runs);
		System.out.println("Batsman : "+this.batsman);
		System.out.println("Bowler : "+this.bowler);
		System.out.println("NonStriker : "+this.nonStriker);
	}
}
