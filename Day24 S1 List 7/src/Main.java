import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	int n,n1;
	ArrayList<String> al=new ArrayList<String>();
	for (int i=0;i<5;i++)
	{
		al.add(sc.nextLine()); 
	}
	System.out.println("Enter swap positons");
	n=sc.nextInt();
	n1=sc.nextInt();
	Collections.swap(al,n,n1);
	for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
	 sc.close();
	} 
} 