import java.util.ArrayList;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	ArrayList<Integer> al=new ArrayList<Integer>();
	for (int i=0; i<n; i++)
		al.add(sc.nextInt());	
	for(int i=0;i<al.size();i++)
	{
		if(i%2!=0)
		{
			if(al.get(i)%2!=0)
				sum=sum+al.get(i);
		}
		if(i%2==0)
		{
			if(al.get(i)%2==0)
				sum=sum+al.get(i);
		}
	}
	System.out.println(sum);
	sc.close();
	} 
} 
