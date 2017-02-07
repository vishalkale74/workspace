import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the over");
		long over=sc.nextLong();
		System.out.println("Enter the ball");
		long ball=sc.nextLong();
		System.out.println("Enter the wicket type");
		sc.nextLine();
		String wicket=sc.nextLine();
		System.out.println("Enter the player name");
		String player=sc.nextLine();
		System.out.println("Enter the bowler name");
		String bowler=sc.nextLine();
		Wicket w=new Wicket();
		w.setOver(over);
		w.setBall(ball);
		w.setWicketType(wicket);
		w.setPlayerName(player);
		w.setBowlerName(bowler);
		System.out.println("Wicket Details");
		System.out.println("Over : "+w.getOver());
		System.out.println("Ball : "+w.getBall());
		System.out.println("Wicket Type : "+w.getWicketType());
		System.out.println("Player Name : "+w.getPlayerName());
		System.out.println("Bowler Name : "+w.getBowlerName());
		sc.close();
	}
}