import java.util.Scanner;
public class Main{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=2;
		Thread tList[]=new Thread[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the match type");
			String matchType=sc.nextLine();
			System.out.println("Enter the points");
			String scoreString=sc.nextLine();
			tList[i]=new SortPoints(matchType,scoreString);
			tList[i].start();
		}
		for(int i=0;i<n;i++)
			tList[i].join();
		//System.out.println("Ordered Score List");
		for(int i=0;i<n;i++){
			System.out.println("Match : "+((SortPoints)tList[i]).getMatchType());
		for(int m:((SortPoints)tList[i]).getScores())
				System.out.println(m+"");
		}
		sc.close();
	}
}