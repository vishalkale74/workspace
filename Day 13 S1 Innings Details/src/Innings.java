public class Innings {



    String battingTeam;
    long runs;

       public Innings(String battingTeam,long runs) {
              
              this.battingTeam = battingTeam;
              this.runs = runs;
       }

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
       public Innings() {
              // TODO Auto-generated constructor stub
       }
}

