import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		String teamName;
		long noOfMatches;
		long noOfWickets;
		long runs;
		long noOfCatches,noOfStumpings,noOfDismissals;
		String ans;
		boolean a=true;
		while(a)
		{
		System.out.println("Menu\n1.Bowler\n2.Batsman\n3.WicketKeeper\n4.AllRounder\nEnter your choice");
		int n=Integer.parseInt(br.readLine());
		switch(n)
		{
			case 1:
					System.out.println("Enter the Bowler details\nEnter player name");
					name=br.readLine();
					System.out.println("Enter team name");
					teamName=br.readLine();
					System.out.println("Enter number of matches played");
					noOfMatches=Long.parseLong(br.readLine());
					System.out.println("Enter number of wickets taken");
					noOfWickets=Long.parseLong(br.readLine());
					Bowler bowler=new Bowler(name, teamName, noOfMatches, noOfWickets);
					bowler.displayPlayerStatistics();
					System.out.println("Do you want to continue?");
					ans=br.readLine();
					if(ans.equalsIgnoreCase("YES"))
						a=true;
					else
						a=false;
				break;
			case 2: 	
					System.out.println("Enter the Batsman details\nEnter player name");
					name=br.readLine();
					System.out.println("Enter team name");
					teamName=br.readLine();
					System.out.println("Enter number of matches played");
					noOfMatches=Long.parseLong(br.readLine());
					System.out.println("Enter the runs scored");
					runs=Long.parseLong(br.readLine());
					Batsman batsman=new Batsman(name, teamName, noOfMatches, runs);
					batsman.displayPlayerStatistics();
					System.out.println("Do you want to continue?");
					ans=br.readLine();
					if(ans.equalsIgnoreCase("YES"))
						a=true;
					else
						a=false;
				break;
			case 3: 
					System.out.println("Enter the WicketKeeper details\nEnter player name");
					name=br.readLine();
					System.out.println("Enter team name");
					teamName=br.readLine();
					System.out.println("Enter number of matches played");
					noOfMatches=Long.parseLong(br.readLine());
					System.out.println("Enter number of catches taken");
					noOfCatches=Long.parseLong(br.readLine());
					System.out.println("Enter number of stumpings");
					noOfStumpings=Long.parseLong(br.readLine());
					System.out.println("Enter number of dismissals");
					noOfDismissals=Long.parseLong(br.readLine());
					System.out.println("Enter the runs scored");
					runs=Long.parseLong(br.readLine());
					WicketKeeper wk=new WicketKeeper(name, teamName, noOfMatches, noOfCatches, noOfStumpings, runs, noOfDismissals);
					wk.displayPlayerStatistics();
					System.out.println("Do you want to continue?");
					ans=br.readLine();
					if(ans.equalsIgnoreCase("YES"))
						a=true;
					else
						a=false;
				break;
			case 4:
					System.out.println("Enter the AllRounder details\nEnter player name");
					name=br.readLine();
					System.out.println("Enter team name");
					teamName=br.readLine();
					System.out.println("Enter number of matches played");
					noOfMatches=Long.parseLong(br.readLine());
					System.out.println("Enter the runs scored");
					runs=Long.parseLong(br.readLine());
					System.out.println("Enter number of wickets taken ");
					noOfWickets=Long.parseLong(br.readLine());
					AllRounder all=new AllRounder(name, teamName, noOfMatches, runs, noOfWickets);
					all.displayPlayerStatistics();
					System.out.println("Do you want to continue?");
					ans=br.readLine();
					if(ans.equalsIgnoreCase("YES"))
						a=true;
					else
						a=false;
				break;
			default:
					System.out.println("Please Enter a Valid Input");
				break;
		}
	}
	}

}
