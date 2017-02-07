import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MatchBO
{
 
 public Match createMatch(String data, Umpire[] umpireList)
  {
   String d[]=data.split(",");
   Match m=null;
   for(int i=0;i<umpireList.length;i++){
	   if(d[3].equals(umpireList[i].getName())){
		   m=new Match(d[0], d[1], d[2], umpireList[i]);//fill your code
	   }
   }
   return m;
  }

  public Match findUmpire(String matchDate, Match[] matchList)
  {
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
	  for(int i=0;i<matchList.length;i++){
		  if(umpireName.equals(matchList[i].getUmpire().getName())){
			  System.out.println(matchList[i].toString());
		  }
	  }
  }
}
