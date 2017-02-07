import java.util.*;
public class Main {

	public static void main(String[] args) {
		long o;
		long b;
		long r;
		String bat,bowl,nonS;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the over");
		o=sc.nextLong();
		System.out.println("Enter the ball");
		b=sc.nextLong();
		System.out.println("Enter the runs");
		r=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman name");
		bat=sc.nextLine();
		System.out.println("Enter the bowler name");
		bowl=sc.nextLine();
		System.out.println("Enter the nonStriker name");
		nonS=sc.nextLine();
		Delivery d=new Delivery();
		d.over=o;
		d.ball=b;
		d.runs=r;
		d.batsman=bat;
		d.bowler=bowl;
		d.nonStriker=nonS;
		d.displayDeliveryDetails();
		sc.close();
	}
}
