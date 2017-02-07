import java.text.SimpleDateFormat;
import java.util.*;
public class Match {

	void displayMatchDetails(Date matchDate)
	{
		SimpleDateFormat df=new SimpleDateFormat("MM-dd-yyyy");
		String date1=df.format(matchDate);
		System.out.println("Match Date : "+date1);
	}
	void displayMatchDetails(String venue) 
	{
		String[] arr=venue.split(",");
		System.out.println("Match Venue :\nStadium : "+arr[0]+"\nCity : "+arr[1]+"");
	}
	void displayMatchDetails(String winnerTeam,long runs)
	{
		System.out.println("Match Outcome :\n"+winnerTeam+" won by "+runs+" runs");
	}
}
