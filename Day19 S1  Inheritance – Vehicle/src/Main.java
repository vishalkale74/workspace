import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		String make;
		String vehicleNumber;
		String fuelType="";
		int fuelCapacity;
		int cc;
		String audioSystem;
		int numberOfDoors;
		boolean kickStartAvailable = false;
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
		int n = sc.nextInt();
		sc.nextLine();
		switch (n) 
		{
		case 1:			
			System.out.println("Vehicle Make:");
			make=sc.nextLine();
			System.out.println("Vehicle Number:");
			vehicleNumber=sc.nextLine();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			int n1=sc.nextInt();
			switch (n1)
			{
			case 1:
				fuelType="Petrol";
				break;
			case 2:
				fuelType="Diesel";
				break;
			}
			System.out.println("Fuel Capacity:");
			fuelCapacity=sc.nextInt();
			System.out.println("Engine CC:");
			cc=sc.nextInt();
			sc.nextLine();
			System.out.println("Audio System:");
			audioSystem=sc.nextLine();
			System.out.println("Number of Doors:");
			numberOfDoors=sc.nextInt();
			FourWheeler fWheeler=new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
			fWheeler.displayMake();
			fWheeler.displayBasicInfo();
			fWheeler.displayDetailInfo();
			break;
		case 2:
			System.out.println("Vehicle Make:");
			make=sc.nextLine();
			System.out.println("Vehicle Number:");
			vehicleNumber=sc.nextLine();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			int n2=sc.nextInt();
			switch (n2)
			{
			case 1:
				fuelType="Petrol";
				break;
			case 2:
				fuelType="Diesel";
				break;
			}
			System.out.println("Fuel Capacity:");
			fuelCapacity=sc.nextInt();
			System.out.println("Engine CC:");
			cc=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Kick Start Available(yes/no):");
			switch (sc.nextLine()) {
			case "yes":
				kickStartAvailable=true;
				break;
			case "no":
				kickStartAvailable=false;
				break;
			}
			TwoWheeler tWheeler=new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc,kickStartAvailable);
			tWheeler.displayMake();
			tWheeler.displayBasicInfo();
			tWheeler.displayDetailInfo();
			break;
		}
		sc.close();
	}

}
