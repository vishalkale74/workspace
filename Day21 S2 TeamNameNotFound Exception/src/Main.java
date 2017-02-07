import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

String a[]= {"Chennai Super Kings","Deccan Chargers","Delhi Daredevils","Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};

String wt,rt;
int flag=0,val=0;
TeamNameNotFoundException tm;
System.out.println("Enter the expected winner team of IPL Season 4");
wt=br.readLine();
for(int i=0;i<8;i++)
{
	if(a[i].equalsIgnoreCase(wt))
	{
		flag++;
	}
}
if(flag==0)
{
	tm=new TeamNameNotFoundException(wt);
	System.exit(0);
	}
System.out.println("Enter the expected runner Team of IPL Season 4");
rt=br.readLine();

for(int i=0;i<8;i++)
{
	if(a[i].equalsIgnoreCase(rt))
	{
		val++;
	}
	
}
	
if(flag!=0 && val!=0)
{
	System.out.println("Expected IPL Season 4 winner: "+wt);
	System.out.println("Expected IPL Season 4 runner: "+rt);
}
else
{
	tm=new TeamNameNotFoundException(wt);}

}

}
