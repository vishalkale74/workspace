import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int sum=0;
	 float avg=0;
	ArrayList<Integer> al=new ArrayList<Integer>();
	 for (int i=0;i<n;i++)
	 {
		 al.add(sc.nextInt()); 
		 sum=sum+al.get(i);
	 }
	 avg=(float)sum/n;
	 System.out.println(sum);
	 System.out.printf("%.2f",avg);
	 sc.close();
	} 
} 