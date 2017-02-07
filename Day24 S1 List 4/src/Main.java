import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<Integer>();
	String name;
	int n,n1;
	System.out.println("Enter the team name");
	name=sc.nextLine();
	System.out.println("Enter the number of matches played in home ground");
	n=sc.nextInt();
	System.out.println("Enter the runs scored");
	for (int i=0;i<n;i++)
	{
		al.add(sc.nextInt()); 
	}
	ArrayList<Integer> al1=new ArrayList<Integer>();
	System.out.println("Enter the number of matches played in other ground");
	n1=sc.nextInt();
	System.out.println("Enter the runs scored");
	for (int i=0;i<n1;i++)
	{
		al1.add(sc.nextInt()); 
	}
	al.addAll(al1);
	System.out.println("Runs scored by "+name);
	for (int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	System.out.println("Run scored by "+name+" more than 300");
	for (int i=0;i<al.size();i++)
	{
		if(al.get(i)>300)
			System.out.println(al.get(i));
	}
	 sc.close();
	} 
} 