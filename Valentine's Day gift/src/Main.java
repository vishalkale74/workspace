import java.util.*;
public class Main{
	public static void main(String args[])
	{
Scanner sc= new Scanner(System.in);
		
		int[] gift= new int[3];
		int total=0;
		for(int i=0;i<3;i++)
		{
			gift[i]=sc.nextInt();
		}
		Arrays.sort(gift);
		total=sc.nextInt();
		sc.nextLine();
		//String s= sc.nextLine();
		boolean flag= Boolean.parseBoolean(sc.nextLine());
		int count=0;
		if(flag)
		{
			System.out.println(3);
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				if(total>=gift[i])
				{	count++;
				total-=gift[i];
				}
			}
			System.out.println(count);
		} 
		sc.close();
	}
}