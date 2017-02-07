import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player name");
		String name=sc.nextLine();
		System.out.println("Enter starting index");
		int n=sc.nextInt();
		System.out.println("Short name of "+name+": "+name.substring(n));
	}

}
