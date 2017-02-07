public class Player {

       String name;
       String country;
       String skill;
       
       public String getName() {
              return name;
       }
       public void setName(String name) {
              this.name = name;
       }
       public String getCountry() {
              return country;
       }
       public void setCountry(String country) {
              this.country = country;
       }
       public String getSkill() {
              return skill;
       }
       public void setSkill(String skill) {
              this.skill = skill;
       }
       public Player(String name ,String country ,String skill) {
              // TODO Auto-generated constructor stub
              this.setName(name);
              this.setCountry(country);
              this.setSkill(skill);
       }
      public Player() {
              // TODO Auto-generated constructor stub
       }
       public boolean equals(Player obj) {
              if (this == obj)
                     return true;
              if (obj == null)
                     return false;
              if (getClass() != obj.getClass())
                     return false;
              Player other = (Player) obj;
              if (country == null) {
                     if (other.country != null)
                           return false;
              } else if (!country.equals(other.country))
                     return false;
              if (name == null) {
                     if (other.name != null)
                           return false;
              } else if (!name.equals(other.name))
                     return false;
              if (skill == null) {
                     if (other.skill != null)
                           return false;
              } else if (!skill.equals(other.skill))
                     return false;
              return true;
       } 

}
