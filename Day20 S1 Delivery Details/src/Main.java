import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		String bowlName;
		String batName;
		long runs;
		System.out.println("Menu\n1.Player details of the delivery\n2.Run details of the delivery");
		n=sc.nextInt();
		sc.nextLine();
		Delivery d=new Delivery();
		switch(n)
		{
		case 1:
				System.out.println("Enter the bowler name");
				bowlName=sc.nextLine();
				System.out.println("Enter the batsman name");
				batName=sc.nextLine();
				d.displayDeliveryDetails(bowlName, batName);
			break;
		case 2: 
				System.out.println("Enter the number of runs");
				runs=sc.nextLong();
				d.displayDeliveryDetails(runs);
			break;
		}
		sc.close();
	}

}
