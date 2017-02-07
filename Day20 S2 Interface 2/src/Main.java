import java.io.*;


public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		String name;
		String teamName;
		long noOfMatches;
		long totalRunsScored;
		long noOfWicketsTaken;
		String Position;
		long noOfGoals;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Menu\n1.Crciket Player Details\n2.Hockey Player Details\nEnter choice");
		int n=Integer.parseInt(br.readLine());
		if(n!=1 && n!=2)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		switch(n)
		{
			case 1:
					System.out.println("Enter player name");
					name=br.readLine();
					System.out.println("Enter team name");
					teamName=br.readLine();
					System.out.println("Enter number of matches played");
					noOfMatches=Long.parseLong(br.readLine());
					System.out.println("Enter total runs scored");
					totalRunsScored=Long.parseLong(br.readLine());
					System.out.println("Enter total number of wickets taken");
					noOfWicketsTaken=Long.parseLong(br.readLine());
					CricketPlayer player=new CricketPlayer(name,teamName,noOfMatches,totalRunsScored,noOfWicketsTaken);
					player.displayPlayerStatistics();
				break;
			case 2:
					System.out.println("Enter player name");
					name=br.readLine();
					System.out.println("Enter team name");
					teamName=br.readLine();
					System.out.println("Enter number of matches played");
					noOfMatches=Long.parseLong(br.readLine());
					System.out.println("Enter the position");
					Position=br.readLine();
					System.out.println("Enter total number of goals taken");
					noOfGoals=Long.parseLong(br.readLine());
					HockeyPlayer hp=new HockeyPlayer(name,teamName,noOfMatches,Position,noOfGoals);
					hp.displayPlayerStatistics();
				break;
		}
	}

}
