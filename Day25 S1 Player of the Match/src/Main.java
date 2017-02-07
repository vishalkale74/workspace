import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		TreeSet<String> ts = new TreeSet<String>(); 
		for(int i=0;i<n;i++)
			ts.add(sc.nextLine()); 
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
		   System.out.println(it.next());
		}		
		sc.close();
		} 
}