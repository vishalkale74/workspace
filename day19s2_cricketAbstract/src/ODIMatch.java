  
public class ODIMatch extends Match {

	public ODIMatch(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
		
	}
public ODIMatch()
{
	
}
	public float calculateRunrate() {
		
		
		float runrate= (this.getTarget()-this.getCurrentScore())/(50-getCurrentOver());
		return runrate;
		
		
		
	}

	public int calculateBalls() {
		
		int ballrem=(int) (300-6*this.getCurrentOver());
		
		return ballrem;
		
	}

}


