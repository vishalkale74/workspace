
public class TwoWheeler extends Vehicle{
	private boolean kickStartAvailable;
	public void setKickStartAvailable(boolean kickStartAvailable) 
	{
		this.kickStartAvailable = kickStartAvailable;
	}
	
	public TwoWheeler() 
	{
		
	}
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public TwoWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc,boolean kickStartAvailable) 
	{
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		setKickStartAvailable(kickStartAvailable);
	}
	
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("Kick Start Available:"+(isKickStartAvailable()?"YES":"NO"));
	}

}
