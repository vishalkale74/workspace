
public class TitleCaseThread implements Runnable 
{
	String summary;
	String modifiedSummary;

	public TitleCaseThread(String summary) 
	{
		super();
		this.summary = summary;
	}

	public void run() 
	{
		String words[]=summary.split(" ");
		modifiedSummary="";
		for(String s:words)
			modifiedSummary+=s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
		modifiedSummary=modifiedSummary.trim();
	}
	public String getmodifiedSummary() {
		return modifiedSummary;
	}
}
