class Delivery
{
private  
    long over;
    long ball;
    long runs; 
    String  batsman;
    String  bowler;
    String  nonStriker;
    public void setOver(long over) {
      this.over = over;
   }
   public long getOver() {
      return over;
   }

   public void setBall(long ball) {
      this.ball = ball;
   }
   public long getBall() {
      return ball;
   }
   public void setRuns(long runs) {
      this.runs = runs;
   }
   public long getRuns() {
      return runs;
   }

   public void setBatsman(String batsman) {
      this.batsman = batsman;
   }
   public String getBatsman() {
      return batsman;
   }

   public void setBowler(String bowler) {
      this.bowler = bowler;
   }
   public String getBowler() {
      return bowler;
   }

public void setNonStriker(String nonStriker) {
      this.nonStriker = nonStriker;
   }
   public String getNonStriker() {
      return nonStriker;
   }
     Delivery()
{
}
    Delivery(long over2,long ball2,long runs2,String batsman,String bowler,String nonStriker)
    {
        this.over=over2;
        this.ball=ball2;
        this.runs=runs2;
        this.batsman=batsman;
        this.bowler=bowler;
        this.nonStriker=nonStriker;
    }

public String toString()
 {
  Object[] a={""+over,""+ball,""+runs,batsman,bowler,nonStriker};
return String.format("%-20s %-20s %-20s %-20s %-20s %s",a);
 }
  
}
