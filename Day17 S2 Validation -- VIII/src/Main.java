import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner tom=new Scanner(System.in);
int count=0;
String a=tom.nextLine();
for(int i=0;i<a.length()-2;i++)
{
String b=a.substring(i,i+3);
int x=Integer.parseInt(b);
if(x%4==0)
{
count++;
}
}
System.out.println(count);
tom.close();
}
}
