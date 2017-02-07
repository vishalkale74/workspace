import java.util.*;
public class SortScore extends Thread {
	String matchType;
	String scoreString;
	Integer[] scores;
	public SortScore(String mt, String sString) 
	{
		super();
		this.matchType = mt;
		this.scoreString = sString;
	}
	public void run()
	{
		int i=0;
		scores=new Integer[scoreString.split(",").length];
		for(String s:scoreString.split(","))
			scores[i++]=Integer.parseInt(s);
		Arrays.sort(scores);
	}
	public Integer[] getScores() {
		return scores;
	}
	public String getMatchType() {
		return matchType;
	}
}
