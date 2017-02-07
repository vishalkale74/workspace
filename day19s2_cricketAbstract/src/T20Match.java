  
public class T20Match extends Match  {

	public T20Match(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
		// TODO Auto-generated constructor stub
	}
public T20Match()
{
	
}
	public float calculateRunrate() {
		float runrate= (this.getTarget()-this.getCurrentScore())/(20-getCurrentOver());
		return runrate;
		
	}

	public int calculateBalls() {
int ballrem=(int) (120-6*this.getCurrentOver());
		
		return ballrem;
	}
	
}


