public class Ranking implements Comparable<Ranking>{

       String name;
       int score;
       public Ranking(String name, int score) {
              super();
              this.name = name;
              this.score = score;
       }
       
       public Ranking() {
              
       }
       public String getName() {
              return name;
       }
       public void setName(String name) {
              this.name = name;
       }
       public int getScore() {
              return score;
       }
       public void setScore(int score) {
              this.score = score;
       }
       
       @Override
       public String toString() {
              return  getName()+ " " + getScore();
       }
       public int compareTo(Ranking r) {

              if(score==r.score)
                     return 0;
              else
                     if(score<r.score)
                           return 1;
                     else return -1;
       }
       
}
