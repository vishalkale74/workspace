public class UserMainCode{
public void OrangeCapDetails(String a)
{
String team=a.substring(0,3);
String x="";
for(int i=0;i<a.length();i++)
{
char y=a.charAt(i);
if(Character.isDigit(y))
{
x=x+y;
}
}
String score=x;
String name=a.substring(3,a.indexOf(x));
System.out.println(team+"\n"+name+"\n"+score);
}
public boolean isAlpha(String name) {
   char[] chars = name.toCharArray();

   for (char c : chars) 
   {
       if(!Character.isLetter(c)) {
           return false;
       }
   }

   return true;
}

}