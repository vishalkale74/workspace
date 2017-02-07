public class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet;

	public int getRatePerSqFeet() {
		if(super.hasWifi){
			return (ratePerSqFeet+2);
		}
		else{
			return ratePerSqFeet;
		}
	}

	public void setRatePerSqFeet(int ratePerSqFeet) 
	{
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV,	boolean hasWifi) 
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	
}
