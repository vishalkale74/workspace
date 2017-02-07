public class UserMainCode {
public boolean validatePlayer(String a)
{
int count=1;
for(int i=0;i<a.length();i++)
{
if(i%2!=0)
{
if(a.charAt(i)=='a' || a.charAt(i)=='A')
{
count=0;
}
}
}
if(count==0)
{
return false;
}
else
{
return true;
}
}

}
