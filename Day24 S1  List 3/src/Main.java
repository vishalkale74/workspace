import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 sc.nextLine();
	 int count=0;
	ArrayList<String> al=new ArrayList<String>();
	 for (int i=0;i<n;i++)
	 {
		 al.add(sc.nextLine()); 
	 }
	 String name=sc.nextLine();
	// System.out.println(Collections.frequency(al, name)); alternate method
	 for(int i=0;i<al.size();i++)
	 {
		 if(name.equals(al.get(i)))
			 count++;
	 }
	 System.out.println(count);
	 sc.close();
	} 
} 