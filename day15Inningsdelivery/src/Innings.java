class Innings
{
  private long inningsNumber;
  private String battingTeam;

 Innings(){}
  Innings(long inningsNumber,String battingTeam)
  {
   this.inningsNumber=inningsNumber;
   this.battingTeam=battingTeam;
  }

  void setInningsNumber(long inningsNumber)
  {
   this.inningsNumber=inningsNumber;
  }
  long getInningsNumber()
  {
   return inningsNumber;
  }

  void setBattingTeam(String battingTeam)
  {
   this.battingTeam=battingTeam;
  }
  String getBattingTeam()
  {
    return battingTeam;
  }
  
}

