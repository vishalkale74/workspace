import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long over;
		long ball;
		long runs;
		String batsman;
		String bowler;
		String nonStriker;
		System.out.println("Enter the over");
		over=sc.nextLong();
		System.out.println("Enter the ball");
		ball=sc.nextLong();
		System.out.println("Enter the runs");
		runs=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		batsman=sc.nextLine();
		System.out.println("Enter the bowler name");
		bowler=sc.nextLine();
		System.out.println("Enter the nonStriker name");
		nonStriker=sc.nextLine();
		Delivery delivery=new Delivery();
		delivery.setOver(over);
		delivery.setBall(ball);
		delivery.setRuns(runs);
		delivery.setBatsman(batsman);
		delivery.setBowler(bowler);
		delivery.setNonStriker(nonStriker);
		System.out.println("Over : "+delivery.getOver());
		System.out.println("Ball : "+delivery.getBall());
		System.out.println("Runs : "+delivery.getRuns());
		System.out.println("Batsman : "+delivery.getBatsman());
		System.out.println("Bowler : "+delivery.getBowler());
		System.out.println("NonStriker : "+delivery.getNonStriker());
	}

}
