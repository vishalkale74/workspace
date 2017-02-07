import java.util.ArrayList;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("Enter the player details\nEnter player name");
	al.add(sc.nextLine());
	System.out.println("Enter age");
	al.add(sc.nextLine());
	System.out.println("Enter Country");
	al.add(sc.nextLine());
	System.out.println("Player Details");
	for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
	System.out.println("Enter Skill");
	String skill=sc.nextLine();
	System.out.println("Enter the position to add the skill");
	int n=sc.nextInt();
	System.out.println("Player Details");
	al.set(n,skill);
	for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
	System.out.println("Enter the position of the detail to be removed");
	int n1=sc.nextInt();
	al.remove(n1);
	System.out.println("Player Details");
	for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
	sc.close();
	} 
} 