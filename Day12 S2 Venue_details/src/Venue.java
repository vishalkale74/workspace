public class Venue {
       String name;
       String city ;
       public String getName() {
              return name;
       }
       public void setName(String name) {
              this.name = name;
       }
       public String getCity() {
              return city;
       }
       public void setCity(String city) {
              this.city = city;
       }
       
       public void Venuedetails()
       {
              System.out.println("Venue Details\nVenue Name : "+this.getName()+"\nCity Name : "+this.getCity());
       }

}

