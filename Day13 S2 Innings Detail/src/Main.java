import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String battingTeam;
		long runs;
		System.out.println("Enter the number of innings");
		int n= scanner.nextInt();
		//scanner.nextLine();
		Innings[] innings= new Innings[n]; 
for (int i = 0; i < innings.length; i++) {
			scanner.nextLine();
			System.out.println("Enter the values for Innings "+(i+1)+"\nEnter the BattingTeam");
			battingTeam=scanner.nextLine();
			System.out.println("Enter the runs scored");
			runs= scanner.nextInt();
			innings[i]=new Innings(battingTeam, runs);
			
		} 
System.out.println("Innings Details");
		for (int i = 0; i < innings.length; i++) {
			System.out.println("Innings "+(i+1)+"\n"+innings[i].toString());
		}
		
		scanner.close();

	}

} 