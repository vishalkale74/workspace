import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter team1");
		String venue1=sc.nextLine();
		System.out.println("Enter team2");
		String venue2=sc.nextLine();
		boolean retVal;
		retVal = venue1.equalsIgnoreCase( venue2 );
		if(retVal)
	      System.out.println("Both the venues are same.");
		else	      
	      System.out.println("Both the venues are different.");
	}

}
