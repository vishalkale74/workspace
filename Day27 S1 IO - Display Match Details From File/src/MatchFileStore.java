import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class MatchFileStore {

	public List<Match> obtainMatchFromFile(InputStreamReader ir) throws Exception
	{
		Match m;
		String teamOne,teamTwo,venue,matchDate;
		
		ArrayList<Match> alm=new ArrayList<Match>();
		String line=null;
		BufferedReader br=new BufferedReader(ir);
		while(((line=br.readLine())!=null))
		{
			teamOne=line.substring(0, 5).trim();
			teamTwo=line.substring(5, 10).trim();
			venue=line.substring(10, 30).trim();
			matchDate=line.substring(30, 40).trim();
			m=new Match(teamOne,teamTwo,venue,matchDate);
			alm.add(m);
		}
		return alm;

		
	}
}
