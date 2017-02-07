public class Player implements Comparable{

String name;

public Player(String name) {
super();
this.name = name;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int compareTo(Object o) {
// TODO Auto-generated method stub
Player p=(Player)o;
if(p.name.compareTo(name)<0)
{
return 1;
}
else
{
return -1;
}
}


}