  
public class TestMatch extends Match {

	public TestMatch(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
		
	}
public TestMatch()
{
	
}
	public float calculateRunrate() {
		float runrate= (this.getTarget()-this.getCurrentScore())/(90-getCurrentOver());
		return runrate;
		
	}

	public int calculateBalls() {
int ballrem=(int) (540-6*this.getCurrentOver());
		
		return ballrem;
	}

}


