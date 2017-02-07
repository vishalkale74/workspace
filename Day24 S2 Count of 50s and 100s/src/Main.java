import java.util.ArrayList;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<Integer>();
	int n,f=0,c=0;
	n=sc.nextInt();
	for(int i=0;i<n;i++)
		al.add(sc.nextInt());
	for(int i=0;i<al.size();i++)
	{
		if(al.get(i)>=50 && al.get(i)<100)
			f++;
		if(al.get(i)>=100)
			c++;
	}
	System.out.println(f);
	System.out.println(c);
	sc.close();
	} 
} 
