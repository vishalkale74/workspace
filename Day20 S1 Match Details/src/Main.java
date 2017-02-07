import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		String date;
		String venue;
		String outcome;
		long runs;
		System.out.println("Menu\n1.Match Date\n2.Match Venue\n3.Match Outcome");
		n=sc.nextInt();
		sc.nextLine();
		Match match=new Match();
		switch(n)
		{
			case 1: 
					System.out.println("Enter the date of the match");
					date=sc.nextLine();
					SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
					Date matchdate=sdf.parse(date);
					//System.out.println(matchdate);
					match.displayMatchDetails(matchdate);
				break;
			case 2: 
					System.out.println("Enter venue of the match");
					venue=sc.nextLine();
					match.displayMatchDetails(venue);
				break;
			case 3: 
					System.out.println("Enter the winner team of the match");
					outcome=sc.nextLine();
					System.out.println("Enter the number of runs");
					runs=sc.nextLong();
					match.displayMatchDetails(outcome, runs);
				break;
		}
	}

}
