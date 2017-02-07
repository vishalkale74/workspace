import java.util.ArrayList;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	int n;
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("Enter the teams in ranking table");
	for (int i=0;i<5;i++)
	{
		al.add(sc.nextLine()); 
	}
	System.out.println("Enter the rank to be searched");
	n=sc.nextInt();
	System.out.println(al.get(n-1));
	 sc.close();
	} 
} 