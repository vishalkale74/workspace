class Wicket
{
private long over;
long ball;
private String wicketType,playerName,bowlerName;
Wicket(){}
Wicket(long over,long ball,String wicketType,String playerName,String bowlerName)
{
this.over=over;
this.ball=ball;
this.wicketType=wicketType;
this.playerName=playerName;
this.bowlerName=bowlerName;
}
   public void setOver(long over) {
      this.over = over;
   }
   public Long getOver() {
      return over;
   }
   public void setBall(long ball) {
      this.ball = ball;
   }
   public long getBall() {
      return ball;
   }
public void setWicketType(String wicketType) {
      this.wicketType = wicketType;
   }
   public String getWicketType() {
      return wicketType;
   }
public void setPlayerName(String playerName) {
      this.playerName = playerName;
   }
   public String getPlayerName() {
      return playerName;
   }
public void setBowlerName(String bowlerName) {
      this.bowlerName = bowlerName;
   }
   public String getBowlerName() {
      return bowlerName;
   }

public String toString()
    {
        
        return String.format("Over:%s\nBall:%s\nWicket Type:%s\nPlayer Name:%s\nBowler Name:%s",over,ball,wicketType,playerName,bowlerName);


    }
}
