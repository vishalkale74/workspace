class VenueBO  {
    public Venue createVenue(String data, City[] cityList) {
       String[] s=data.split(",");
       City ct=null;
       for(int i=0;i<cityList.length;i++)
       {
    	   if(cityList[i].getName().equals(s[1]))
    	   {
    		   ct=cityList[i];
    	   }
       }
       Venue vnew= new Venue(s[0], ct);
       return vnew;
    }
}
