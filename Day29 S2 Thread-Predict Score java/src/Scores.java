import java.util.ArrayList;
import java.util.Iterator;


public class Scores implements Runnable 
{
	String scoreType;
	int start,end;
	ArrayList<Integer> scoreList=new ArrayList<Integer>();
	public Scores(String scoreType, int start, int end) 
	{
		super();
		this.scoreType = scoreType;
		this.start = start;
		this.end = end;
	}
	public void run()
	{
		for(int i=this.start;i<=this.end;i++)
			if(i % 2 == (scoreType.equalsIgnoreCase("even") ? 0 : 1))
				scoreList.add(i);
		this.display();
	}
	public void display()
	{
		String str="";
		Iterator<Integer> iter = scoreList.iterator();
		while(iter.hasNext())
			str+=iter.next()+" ";
		System.out.println((scoreType.equalsIgnoreCase("even") ? "Even numbers in given range\n"+str.trim() :"Odd numbers in given range\n" +str));
	}
	public String getScoreType() {
		return scoreType;
	}
	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
}