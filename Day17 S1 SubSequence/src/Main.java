import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter team name");
		String team=sc.nextLine();
		System.out.println("Enter starting index of the sequence");
		int a=sc.nextInt();
		System.out.println("Enter ending index of the sequence");
		int b=sc.nextInt();
		System.out.println(team.subSequence(a, b) );
	}

}
