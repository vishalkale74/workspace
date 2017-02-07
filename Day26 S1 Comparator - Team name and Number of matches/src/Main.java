import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String name;
		long numberOfMatches;
		ArrayList<Team> al=new ArrayList<Team>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of teams:");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter team "+(i+1)+" detail\nEnter Name");
			name=br.readLine();
			System.out.println("Enter number of matches");
			numberOfMatches=Long.parseLong(br.readLine());
			al.add(new Team(name,numberOfMatches)); 
		}
		TeamComparator tc=new TeamComparator();
		Collections.sort(al, tc);
		System.out.println("Team list after sort by number of matches");
		for(Team t:al)
		{
			System.out.println(t.getName()+"-"+t.getNumberOfMatches());
		}
	}

}
