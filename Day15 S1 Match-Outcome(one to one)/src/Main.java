import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of matches");
		int n= Integer.parseInt(br.readLine());
		Match[] matchList= new Match[n];
		Outcome[] outcome = new Outcome[n];
		String date,t1,t2,venue,status,wt;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter match "+(i+1)+" details:");
			System.out.println("Enter match date");
			date= br.readLine();
			System.out.println("Enter team one");
			t1=br.readLine();
			System.out.println("Enter team two");
			t2=br.readLine();
			System.out.println("Enter venue");
			venue=br.readLine();
			System.out.println("Enter status");
			status=br.readLine();
			System.out.println("Enter winner Team");
			wt=br.readLine();
			outcome[i]= new Outcome(status, wt);
			matchList[i]= new Match(date, t1, t2, venue, outcome[i]);
		}
		
		MatchBO bo = new MatchBO();
		int choice=0;
		do{
		System.out.println("Menu\n1.View match details\n2.Filter match details with outcome status\n3.Filter match details with outcome winner team\n4.Exit\nEnter your choice");
		choice = Integer.parseInt(br.readLine());
		
		switch(choice)
		{
		case 1: bo.printAllMatchDetails(matchList);
		break;
		case 2:
			System.out.println("Enter outcome status");
			String status1= br.readLine();
			bo.printMatchDetailsWithOutcomeStatus(matchList, status1);
			break;
			
		case 3:
			System.out.println("Enter outcome winner team");
			String winner= br.readLine();
			bo.printMatchDetailsWithOutcomeWinnerTeam(matchList, winner);
			break;
		case 4:
			System.exit(0);
			break;
		}
		
		}while(choice!=4);
	}

}
