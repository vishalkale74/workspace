import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Match m=new Match();
		MatchFileStore mt=new MatchFileStore();
		
		InputStream i=new FileInputStream(new File("matches.txt"));
		ArrayList<Match>  alm=(ArrayList<Match>) mt.obtainMatchFromFile(new InputStreamReader(i));
		System.out.println("The Match Details are :");
		for(int j=0;j<alm.size();j++)
		{
			Match match= (Match)alm.get(j);
			m.displayMatch(match, (j+1));
		}
	}

}
