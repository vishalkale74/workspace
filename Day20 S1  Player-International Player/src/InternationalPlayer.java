
public class InternationalPlayer extends Player
{
	private
	String capNumber;
	long noOfTestAppearance;
	long noOfODIAppearance;
	
	public InternationalPlayer(String name,String country,String capNumber,long noOfTestAppearance,long noOfODIAppearance)
	{
		super(name,country);
		this.capNumber=capNumber;
		this.noOfTestAppearance=noOfTestAppearance;
		this.noOfODIAppearance=noOfODIAppearance;
	}
	public InternationalPlayer()
	{
		
	}
	public String getCapNumber() {
		return capNumber;
	}
	public void setCapNumber(String capNumber) {
		this.capNumber = capNumber;
	}
	public long getNoOfTestAppearance() {
		return noOfTestAppearance;
	}
	public void setNoOfTestAppearance(long noOfTestAppearance) {
		this.noOfTestAppearance = noOfTestAppearance;
	}
	public long getNoOfODIAppearance() {
		return noOfODIAppearance;
	}
	public void setNoOfODIAppearance(long noOfODIAppearance) {
		this.noOfODIAppearance = noOfODIAppearance;
	}
	
	public void displayDetails() 
	{
		System.out.println("Player Details:");
		System.out.println("Player name : "+getName());
		System.out.println("Country : "+getCountry());
		System.out.println("Cap number : "+getCapNumber());
		System.out.println("Number of test appearnace : "+getNoOfTestAppearance());
		System.out.println("Number of ODI appearnace : "+getNoOfODIAppearance());
	}
}
