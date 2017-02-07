/*import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String	name;
		String	city;
		System.out.println("Enter the venue name");
		name=sc.nextLine();
		System.out.println("Enter the city name");
		city=sc.nextLine();
		Venue venue=new Venue();
		venue.setName(name);
		venue.setCity(city);
		VenueBO v=new VenueBO();
		v.displayVenueDetails(venue);
	}

}*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
    	Scanner scanner= new Scanner(System.in);
    	String name;
    	String city;
    	System.out.println("Enter the venue name");
    	name=scanner.next();
    	System.out.println("Enter the city name");
    	city=scanner.next();
		Venue venue= new Venue(name, city);
		VenueBO venueBO= new VenueBO();
		venueBO.displayVenueDetails(venue);
		scanner.close();
	}

}


