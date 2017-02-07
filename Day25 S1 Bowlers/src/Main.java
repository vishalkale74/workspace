import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<String> al = new ArrayList<String>(); 
		for(int i=0;i<n;i++)
			al.add(sc.nextLine()); 
		TreeSet ts=new TreeSet<String>(al);
		Iterator<String> it=ts.iterator();
		System.out.println("Players list in ascending order");
		while(it.hasNext())
		{
		   System.out.println(it.next());
		}		
		sc.close();
		} 
}