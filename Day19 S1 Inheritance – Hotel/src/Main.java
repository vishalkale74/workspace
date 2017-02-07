import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String hotelName;
		int numberOfSqFeet;
		boolean hasTV;
		boolean hasWifi;
		System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
		int n=sc.nextInt();
		sc.nextLine();
		switch(n)
		{
		case 1:
			System.out.println("Hotel Name:");
			hotelName=sc.nextLine();
			System.out.println("Room Square Feet Area:");
			numberOfSqFeet=sc.nextInt();
			sc.nextLine();
			System.out.println("Room has TV (yes/no):");
			String tv=sc.nextLine();
			if(tv.equals("yes")){
				hasTV=true;
			}
			else{
				hasTV=false;
			}
			System.out.println("Room has Wifi (yes/no):");
			String wi=sc.nextLine();
			if(wi.equals("yes")){
				hasWifi=true;
			}
			else{
				hasWifi=false;
			}
			DeluxeRoom dR=new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is:"+dR.calculateTariff());
		break;
		case 2:
			System.out.println("Hotel Name:");
			hotelName=sc.nextLine();
			System.out.println("Room Square Feet Area:");
			numberOfSqFeet=sc.nextInt();
			sc.nextLine();
			System.out.println("Room has TV (yes/no):");
			String tv1=sc.nextLine();
			if(tv1.equals("yes")){
				hasTV=true;
			}
			else{
				hasTV=false;
			}
			System.out.println("Room has Wifi (yes/no):");
			String wi1=sc.nextLine();
			if(wi1.equals("yes")){
				hasWifi=true;
			}
			else{
				hasWifi=false;
			}
			DeluxeACRoom dAC=new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is:"+dAC.calculateTariff());
		break;
		case 3:
			System.out.println("Hotel Name:");
			hotelName=sc.nextLine();
			System.out.println("Room Square Feet Area:");
			numberOfSqFeet=sc.nextInt();
			sc.nextLine();
			System.out.println("Room has TV (yes/no):");
			String tv2=sc.nextLine();
			if(tv2.equals("yes")){
				hasTV=true;
			}
			else{
				hasTV=false;
			}
			System.out.println("Room has Wifi (yes/no):");
			String wi2=sc.nextLine();
			if(wi2.equals("yes")){
				hasWifi=true;
			}
			else{
				hasWifi=false;
			}
			SuiteACRoom SaR=new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is:"+SaR.calculateTariff());
			break;
		}
		sc.close();
	}

}
