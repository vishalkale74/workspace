 class Match
{

 private String date;
 private String teamOne;
 private String teamTwo;
 private String venue;

 Match(){}
 Match(String date,String teamOne,String teamTwo,String venue)
 {
  this.date=date;
  this.teamOne=teamOne;
  this.teamTwo=teamTwo;
  this.venue=venue;
 }

 void setDate(String date)
 {
  this.date=date;
 }

 String getDate()
 {
  return date;
 }
  
 void setTeamOne(String teamOne)
 {
  this.teamOne=teamOne;
 }

 String getTeamOne()
 {
  return teamOne;
 }

 void setTeamTwo(String teamTwo)
 {
  this.teamTwo=teamTwo;
 }

 String getTeamTwo()
 {
  return teamTwo;
 }

 void setVenue(String venue)
 {
  this.venue=venue;
 }

 String getVenue()
 {
  return venue;
 }

 public String toString()
 {
  return String.format("%-35s %-30s %-15s %s",teamOne,teamTwo,date,venue);
 }


}







