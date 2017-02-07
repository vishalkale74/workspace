import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter player names");
		String a=sc.nextLine();
		String b=sc.nextLine();
		String[] arr=a.split(" ");
		String c=arr[0];
		if(a.regionMatches(0, c, 0, 7)==b.regionMatches(0, c, 0, 7))
		{
			System.out.println("Both the players names starts with "+c);
		}
		else
			System.out.println("Both the players names does not starts with "+c);
	}

}
