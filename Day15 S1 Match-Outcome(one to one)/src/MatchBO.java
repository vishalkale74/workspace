
public class MatchBO {
	
	public void printAllMatchDetails(Match[] MatchList)
	{
		System.out.println("Match Details");
		String[] s={"Date","Team1","Team2","Venue","Status","Winner"}; 
		String s1= String.format("%-15s %-15s %-15s %-15s %-15s %s", s);
		System.out.println(s1);
		for(int i=0;i<MatchList.length;i++)
		{
			System.out.println(MatchList[i].toString());
		}
	}
	
	public void printMatchDetailsWithOutcomeStatus(Match[] MatchList, String outcomeStatus)
	{
		System.out.println("Match Details");
		String[] s={"Date","Team1","Team2","Venue","Status","Winner"}; 
		String s1= String.format("%-15s %-15s %-15s %-15s %-15s %s",s);
		System.out.println(s1);
		int flag=0;
		for(int i=0;i<MatchList.length;i++)
		{
			if(MatchList[i].getOutcome().getStatus().equals(outcomeStatus))
			{
				flag=1;
				System.out.println(MatchList[i].toString());
			}
			
		}
		if(flag==0)
		{
			System.out.println("Status not found");
		}
	}
	
	public void printMatchDetailsWithOutcomeWinnerTeam(Match[] MatchList, String outcomeWinnerTeam)
	{System.out.println("Match Details");
	String[] s={"Date","Team1","Team2","Venue","Status","Winner"}; 
	String s1= String.format("%-15s %-15s %-15s %-15s %-15s %s", s);
	System.out.println(s1);
		int flag=0;
		for(int i=0;i<MatchList.length;i++){
			if(MatchList[i].getOutcome().getWinnerTeam().equals(outcomeWinnerTeam))
			{
				flag=1;
				System.out.println(MatchList[i].toString());
				
			}
		}
		if(flag==0)
		{
			System.out.println("Winner Team not found");
		}
	}

}
