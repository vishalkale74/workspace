import java.util.ArrayList;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int sum=0;
	 float avg=0f;
	ArrayList<Integer> al=new ArrayList<Integer>();
	 for (int i=0;i<n;i++)
	 {
		 al.add(sc.nextInt()); 
		 sum=sum+al.get(i);
	 }
	 avg=sum;
	 System.out.println(sum);
	 System.out.println(avg/n);
	 sc.close();
	} 
} 