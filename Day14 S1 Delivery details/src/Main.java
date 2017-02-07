import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long	over;
		long	ball;
		String	batsman;
		String	bowler;
		String	nonStriker;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of deliveries");
		int n=sc.nextInt();
		sc.nextLine();
		Delivery [] delivery=new Delivery[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the over");
			over=sc.nextLong();
			System.out.println("Enter the ball");
			ball=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter the batsman");
			batsman=sc.nextLine();
			System.out.println("Enter the bowler");
			bowler=sc.nextLine();
			System.out.println("Enter the nonStriker");
			nonStriker=sc.nextLine();
			delivery[i]=new Delivery(over,ball,batsman,bowler,nonStriker);	
		}
		DeliveryBO deliveryBO=new DeliveryBO();
		deliveryBO.displayAllDeliveryDetails(delivery);

	}

}
