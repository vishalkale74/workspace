
public class UserMainCode {
public boolean validatePlayer(String a,String b,String c)
{
String x;
if(b.contains(" "))
{
x="";
b=' '+b;
for(int i=0;i<b.length();i++)
{
char e=b.charAt(i);
if(e==' ')
{
x=x+b.charAt(i+1);
}
}
}
else
{
x=b.substring(0,3);
}
String[] ar=c.split("#");
if(ar[1].equalsIgnoreCase(x))
{
return true;
}
else
{
return false;
}
}

}
