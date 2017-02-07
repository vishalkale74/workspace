import java.util.HashSet;
import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		HashSet<String> hs = new HashSet<String>(); 
		//add elements to HashSet 
		for(int i=0;i<n;i++)
			hs.add(sc.nextLine()); 
		System.out.println(hs.size());
		sc.close();
		} 
}