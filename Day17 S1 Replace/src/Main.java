import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter team details");
		String team=sc.nextLine();
		String replace=team.replaceAll("Captain", "Skipper");
		System.out.println("After replacement");
		System.out.println(replace);
	}

}
