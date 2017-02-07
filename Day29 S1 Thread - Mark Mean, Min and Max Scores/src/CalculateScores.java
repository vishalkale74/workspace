public class CalculateScores implements Runnable {
	String matchType;
	String scoreString;		
	int[] scores;
	Double meanScore;		
	int minScore;
	int maxScore;
	public CalculateScores(String mt, String sString) {
		super();
		this.matchType = mt;
		this.scoreString = sString;
		minScore=10000;
		maxScore=0;
	}
	public void run(){
		int i=0,sum=0;
		int n=scoreString.split(",").length;
		scores=new int[n];
		for(String s:scoreString.split(","))
		{
			scores[i]=Integer.parseInt(s);
			sum+=scores[i];
			if(minScore> scores[i])
				minScore=scores[i];
			if(maxScore < scores[i])
				maxScore=scores[i];
			i++;
		}
		meanScore=(double)sum/(double)n;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String mt) {
		this.matchType = mt;
	}
	public String getScoreString() {
		return scoreString;
	}
	public void setScoreString(String sString) {
		this.scoreString = sString;
	}
	public int[] getScores() {
		return scores;
	}
	public void setMarks(int[] score) {
		this.scores = score;
	}
	public Double getMeanScore() {
		return meanScore;
	}
	public void setMeanScore(Double meanScore) {
		this.meanScore = meanScore;
	}
	public int getMinScore() {
		return minScore;
	}
	public void setMinScore(int minScore) {
		this.minScore = minScore;
	}
	public int getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}
}
