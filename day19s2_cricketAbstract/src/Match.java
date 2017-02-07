public abstract class Match {
	private int currentScore;
	private float currentOver;
	private int target;
	
	public Match() {
		
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public Match(int currentScore, float currentOver, int target) {
		super();
		this.currentScore = currentScore;
		this.currentOver = currentOver;
		this.target = target;
	}
	public abstract float calculateRunrate();
	
	public abstract int calculateBalls();
	
	public void display(double reqRunRate,int balls){	
		System.out.println("Requirements:");
		System.out.println("Need " +(target - currentScore)+(balls > 1 ? " Runs" : " Run" )+" in "+balls+(balls > 1 ? " balls" : " ball" ));		
		//String[] reqrr={Double.toString(reqRunRate)};
		System.out.printf("Required Run Rate - %.2f\n",reqRunRate);
		
	}

}


