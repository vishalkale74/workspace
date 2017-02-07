import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String summary;
		System.out.println("Enter the number of lines in the summary");
		n=Integer.parseInt(br.readLine());
		TitleCaseThread[] tcList=new TitleCaseThread[n];
		Thread tList[]=new Thread[n];
		for(int i=0;i<n;i++)
		{
			summary=br.readLine();
			tcList[i]=new TitleCaseThread(summary);
			//tList[i]=new Thread(new TitleCaseThread(summary)); alternative method
			tList[i]=new Thread(tcList[i]);
			tList[i].start();
		}
		for(int i=0;i<n;i++)
			tList[i].join();		
		for(int i=0;i<n;i++)
		{
			System.out.println("Sentence "+(i+1)+" : "+tcList[i].getmodifiedSummary());
		}	
	}
}