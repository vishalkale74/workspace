import java.util.ArrayList;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("Enter the top 5 scorers of IPL Season 8");
	for (int i=0;i<5;i++)
	{
		al.add(sc.nextLine()); 
	}
	ArrayList<String> al1=new ArrayList<String>();
	System.out.println("Enter the top 5 scorers of IPL Season 9");
	for (int i=0;i<5;i++)
	{
		al1.add(sc.nextLine()); 
	}
	System.out.println("Consistent run scorers");
	for (int i=0;i<al.size();i++)
	{
		for(int j=0;j<al1.size();j++)
			if(al.get(i).equals(al1.get(j)))
				System.out.println(al.get(i));
	}
	 sc.close();
	} 
} 