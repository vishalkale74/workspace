public class Innings {
       String battingTeam;
       long runs; 

       public String getBattingTeam() {
              return battingTeam;
       }

       public void setBattingTeam(String battingTeam) {
              this.battingTeam = battingTeam;
       }

       public long getRuns() {
              return runs;
       }

       public void setRuns(long runs) {
              this.runs = runs;
       }

       public Innings(String battingTeam,long runs) {
              
              this.runs = runs;
              this.battingTeam = battingTeam;
       }
       public Innings() {
              // TODO Auto-generated constructor stub
       }
       
       public String toString() {
              String outString="";
              
              outString+=this.battingTeam+" -- "+this.runs;
              
              return outString;
              
       }

}
