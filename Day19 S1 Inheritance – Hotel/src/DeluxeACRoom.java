public class DeluxeACRoom extends DeluxeRoom {
	protected int ratePerSqFeet;

	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV,
			boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;
	}
	
}
