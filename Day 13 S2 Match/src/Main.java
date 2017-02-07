import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String date; 
		 String teamOne; 
		 String teamTwo; 
		 String venue; 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the match date");
		 date=sc.nextLine();
		 System.out.println("Enter the team one");
		 teamOne=sc.nextLine();
		 System.out.println("Enter the team two");
		 teamTwo=sc.nextLine();
		 System.out.println("Enter the Venue");
		 venue=sc.nextLine();
		 
		 Match match=new Match();
		 match.setDate(date);
		 match.setTeamOne(teamOne);
		 match.setTeamTwo(teamTwo);
		 match.setVenue(venue);
		 
		 System.out.println("Match Details");
		 System.out.println(match.toString());
	}

}
