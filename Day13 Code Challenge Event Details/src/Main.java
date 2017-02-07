import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of events");
		int n=sc.nextInt();
		sc.nextLine();
		String	extraType;
		long points;
		String scoringTeam;
		ExtraEvent[] e=new ExtraEvent[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the values for event "+(i+1));
			System.out.println("Enter the extra type");
			extraType=sc.nextLine();
			System.out.println("Enter the points scored");
			points=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter the scoring team");
			scoringTeam=sc.nextLine();
			e[i]=new ExtraEvent(extraType,points,scoringTeam);
		}
		
		
		System.out.println("Extra Event Details");
		for(int i=0;i<n;i++)
		{
			System.out.println("Event"+(i+1));
			System.out.println(e[i].toString());
		}
	}

}
