
public class WicketBO {

	void displayAllWicketDetails(Wicket[] wicketList)
	{
		System.out.println("Wicket Details");
		for(int i=0;i<wicketList.length;i++)
		{
			System.out.println("Wicket "+(i+1));
			System.out.println(wicketList[i].toString());
		}
	}
	void displaySpecificWicketDetails(Wicket[] wicketList, String wicketType)
	{
		int n=wicketList.length;
		for(int i=0;i<n;i++)
		{
			if(wicketList[i].getWicketType().equals(wicketType))
			{
				System.out.println("Wicket "+(i+1));
				System.out.println(wicketList[i].toString());
			}
		}
	}
}
