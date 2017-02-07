import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
 public static void main(String args[]) throws IOException{

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the number of matches");
       int n=Integer.parseInt(br.readLine());
  Match[] match=new Match[n];
  for(int i=0;i<n;i++)
        {
            System.out.println("Enter match "+(i+1)+" details");
   System.out.println("Enter the match date");
   String date=br.readLine();
   System.out.println("Enter the team one");
   String teamOne=br.readLine();
   System.out.println("Enter the team two"); 
   String teamTwo=br.readLine();
   System.out.println("Enter the Venue");
   String venue=br.readLine();
  match[i]=new Match(date,teamOne,teamTwo,venue);
   }
MatchBO matchBo=new MatchBO();
matchBo.displayAllMatchDetails(match);
System.out.println("Enter the date to be searched");
String sd=br.readLine();
matchBo.displaySpecificMatchDetails(match,sd);

}
}


