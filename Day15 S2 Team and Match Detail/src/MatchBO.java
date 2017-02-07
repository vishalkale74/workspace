
class MatchBO
{
   
 public Match createMatch(String data, Team[] teamList)
  {
	 Team t=null;
	 String arr[]=data.split(",");
	 for(int i=0;i<teamList.length;i++){
		 if(arr[1].equals(teamList[i].getName())){
			 t=teamList[i];
		 }
		 
	 }
	 Match m=new Match(arr[0],arr[1],arr[2],arr[3],t);
	 return m;
    //fill your code
  }

  public Match findTeam(String matchDate, Match[] matchList)
  {
	  Match m=null;
   for(int i=0;i<matchList.length;i++){
	   if(matchDate.equals(matchList[i].getDate())){
		   m=matchList[i];//fill your code
	   }
   }
   return m;
   
  }

  public void findAllMatchesInGivenTeam(String teamName, Match[] matchList)
  {
	
    for(int i=0;i<matchList.length;i++){
    	if(teamName.equals(matchList[i].getTeam().getName())){
    		System.out.println(matchList[i].toString());
    	}
    }
  
   }


  
}
