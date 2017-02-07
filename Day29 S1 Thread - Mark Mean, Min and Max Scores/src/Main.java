import java.util.*;
public class Main{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=3;
		CalculateScores csList[]=new CalculateScores[n];
		Thread tList[]=new Thread[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the match :");
			String matchType=sc.nextLine();
			System.out.println("Enter the scores :");
			String scoreString=sc.nextLine();
			csList[i]=new CalculateScores(matchType,scoreString);
			tList[i]=new Thread(csList[i]);
			tList[i].start();
		}
		for(int i=0;i<n;i++)
			tList[i].join();		
		System.out.println("Score Summary");
		for(int i=0;i<n;i++){
			System.out.println("Match : "+csList[i].getMatchType());
			System.out.printf("Mean : %.2f\n",csList[i].getMeanScore());
			System.out.println("Min Score : "+csList[i].getMinScore());
			System.out.println("Max Score : "+csList[i].getMaxScore());
		}	
		sc.close();
	}
}