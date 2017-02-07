import java.util.*;
public class Main{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=3;
		Thread tList[]=new Thread[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Match :");
			String matchType=sc.nextLine();
			System.out.println("Enter the Scores :");
			String scoreString=sc.nextLine();
			tList[i]=new SortScore(matchType,scoreString);
			tList[i].start();
		}
		for(int i=0;i<n;i++)
			tList[i].join();
		System.out.println("Ordered Score List");
		for(int i=0;i<n;i++){
			System.out.println("Match : "+((SortScore)tList[i]).getMatchType());
		for(int m:((SortScore)tList[i]).getScores())
				System.out.println(m+"");
		}
		sc.close();
	}
}