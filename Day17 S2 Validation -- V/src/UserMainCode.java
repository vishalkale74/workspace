public class UserMainCode {
public boolean validateOver(String a)
{
int count=0;
if(a.length()==6 && a.contains("W"))
{
for(int i=0;i<6;i++)
{
char x=a.charAt(i);
if(x=='0' || x=='1' || x=='2' || x=='3' || x=='4' || x=='5' || x=='6' || x=='W' || x=='w')
{
count++;
}
}
if(count==6)
{
return true;
}
else
{
return false;
}
}
else
{
return false;
}
}

}