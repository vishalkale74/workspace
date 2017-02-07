import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	ArrayList<Character> al=new ArrayList<Character>();
	for (int i = 0; i < name.length(); i++)
	{
		al.add(name.charAt(i));
	}
	
	Collections.reverse(al);
	for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
	sc.close();
	} 
} 
