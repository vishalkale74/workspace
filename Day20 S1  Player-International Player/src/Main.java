import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		String country;
		String capNumber;
		long noOfTestAppearance;
		long noOfODIAppearance;
		System.out.println("Enter player name ");
		name=sc.nextLine();
		System.out.println("Enter player country");
		country=sc.nextLine();
		System.out.println("Enter the Cap number");
		capNumber=sc.nextLine();
		System.out.println("Enter the number of test appearnace");
		noOfTestAppearance=sc.nextLong();
		System.out.println("Enter the number of ODI appearnace");
		noOfODIAppearance=sc.nextLong();
		InternationalPlayer iPlayer=new InternationalPlayer(name,country,capNumber,noOfTestAppearance,noOfODIAppearance);
		iPlayer.displayDetails();
		sc.close();
	}

}
