class MatchBO
{
MatchBO(){}

void displayAllMatchDetails(Match[] matchList)
{
	System.out.println("Match Details");
	Object[] a={"Team 1","Team 2","Date","Venue"};
	System.out.println(""+String.format("%-35s %-30s %-15s %s",a));
	for (int i = 0; i < matchList.length; i++) {
		System.out.println(matchList[i].toString());
	}
//fill your code
}


void displaySpecificMatchDetails(Match[] matchList, String date)
{
	System.out.println("Match Details");
	Object[] a={"Team 1","Team 2","Date","Venue"};
	System.out.println(""+String.format("%-35s %-30s %-15s %s",a));
	
	for (int i = 0; i < matchList.length; i++) {
		if(matchList[i].getDate().equals(date))
		{
			System.out.println(matchList[i].toString());
		}
	}

}
}
