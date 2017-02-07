

import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {

   public static void main(String[] args) throws Exception {
      
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String stadiumName;
       String city;
       System.out.println("Enter the venue name");
       stadiumName=br.readLine();
       System.out.println("Enter the city name");
       city=br.readLine();
       Venue venue=new Venue(stadiumName,city);
       VenueBO venueBO=new VenueBO();
       venueBO.displayKabbadiVenueDetails(venue);
       
       
   }

}









