import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
 
 public Match createMatch(String data, Umpire[] umpireList)
  {
	 Umpire umpire=null;
	 String arr[]=data.split(",");
	 for(int i=0;i<umpireList.length;i++){
		 if(arr[1].equals(umpireList[i].getName())){
			 umpire=umpireList[i];
		 }}
	 Match m=new Match(arr[0],arr[1],arr[2],umpire);
	 return m;
  }

  public Match findUmpire(String matchDate, Match[] matchList)
  {
   //fill your code
	  Match m=null;
	   for(int i=0;i<matchList.length;i++){
		   if(matchDate.equals(matchList[i].getDate())){
			   m=matchList[i];//fill your code
		   }
	   }
	   return m;
  }
 
  public void findAllMatchesOfGivenUmpire(String umpireName, Match[] matchList)
  {
   //fill your code

	    for(int i=0;i<matchList.length;i++){
	    	if(umpireName.equals(matchList[i].getUmpire().getName())){
	    		System.out.println(matchList[i].toString());
	    	}
	    }
  }
}
