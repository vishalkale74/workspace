class Delivery
{
  private long deliveryNumber;
  private String batsman;
  private String bowler;
  private long runs;
  private Innings innings;

  Delivery() {}
  Delivery(long deliveryNumber,String batsman,String bowler,long runs,Innings innings)
  {
   this.deliveryNumber=deliveryNumber;
   this.batsman=batsman;
   this.bowler=bowler;
   this.runs=runs;
   this.innings=innings;
   }




  void setDeliveryNumber(long deliveryNumber)
  {
   this.deliveryNumber=deliveryNumber;
  }
  long getDeliveryNumber()
  {
   return deliveryNumber;
  }

  void setBatsman(String batsman)
  {
   this.batsman=batsman;
  } 
  String getBatsman()
  {
    return batsman;
  }
 
  void setBowler(String bowler)
  {
   this.bowler=bowler;
  }
  String getBowler()
  {
   return bowler;
  }

  void setRuns(long runs)
  {
   this.runs=runs;
  }
  long getRuns()
  {
   return runs;
  }
  
  void setInnings(Innings innings)
  {
   this.innings=innings;
  }
  Innings getInnings()
  {
   return innings;
  } 


}
