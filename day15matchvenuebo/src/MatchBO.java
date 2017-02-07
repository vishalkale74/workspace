class MatchBO {
    public Match createMatch(String data, Venue[] venueList) {		
           String[] s1=data.split(",");
           Venue vnew=null;
           for(int i=0;i<venueList.length;i++)
           {
        	   if(venueList[i].getName().equals(s1[3]))
        	   {
        		   vnew = venueList[i];
        	   }
           }
           Match match = new Match(s1[0],s1[1],s1[2],vnew);
           return match;
    }
    public void findVenue(String date, Match[] matchList) {
		
              for(int i=0;i<matchList.length;i++)
              {
            	  if(matchList[i].getDate().equals(date))
            	  {
            		  System.out.println("Match was held at "+matchList[i].getVenue().getName());
            	  }
              }
	}
	
	
    
    public void findAllMatchesInGivenVenue(String sname, Match[] matchList) {
	     for(int i=0;i<matchList.length;i++)
	     {
	    	
	    	 if(matchList[i].getVenue().getName().equals(sname))
	    	 {
	    		 System.out.println(matchList[i].toString());
	    	 }
	     }
		
	}
	
	
	
				
}
