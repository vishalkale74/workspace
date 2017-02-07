import java.util.Comparator;


public class TeamComparator implements Comparator<Team>
{
	public int compare(Team arg0, Team arg1) {
		// TODO Auto-generated method stub
		return  ((int) (arg0.getNumberOfMatches()-arg1.getNumberOfMatches()));

	}
}