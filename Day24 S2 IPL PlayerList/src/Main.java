import java.util.ArrayList;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	ArrayList<String> al=new ArrayList<String>();
	int n,n1;
	n=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<n;i++)
		al.add(sc.nextLine());
	boolean a=true;
	while(a)
	{
		System.out.println("Menu\n1.Insert Players\n2.Delete Players");
		n1=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		switch(n1)
		{
			case 1: al.add(name);
					System.out.println("Player details after insertion");
					for(int i=0;i<al.size();i++)
						System.out.println(al.get(i));
					/*System.out.println("Do you want to continue");
					if(sc.nextLine().equals("Yes"))
						a=true;
					else
						a=false;*/
				break;
			case 2: al.remove(name);
					System.out.println("Player details after deletion");
					for(int i=0;i<al.size();i++)
						System.out.println(al.get(i));
					/*System.out.println("Do you want to continue");
					if(sc.nextLine().equals("Yes"))
						a=true;
					else
						a=false;*/
					break;
		}
		System.out.println("Do you want to continue");
		if(sc.nextLine().equals("Yes"))
			a=true;
		else
			a=false;
	}
	sc.close();
	} 
} 
