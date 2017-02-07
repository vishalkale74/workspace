public class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet;

	public int getRatePerSqFeet() 
	{
		if(super.hasWifi)
		{
			return (ratePerSqFeet+2);
		}
		else{
			return ratePerSqFeet;
		}
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV,boolean hasWifi) 
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		setRatePerSqFeet(10);
	}
	
}
