import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float runs,overs;
		float runrate;
		//NumberFormat f=new DecimalFormat("#0.00");
		OverRangeException o;
		System.out.println("Enter the total runs scored");
		runs=sc.nextInt();
		System.out.println("Enter the total overs faced");
		overs=sc.nextInt();
		if(overs>0 && overs<=20)
		{
			runrate=runs/overs;
		System.out.printf("Current Run Rate :%.2f",runrate);	
		}
		else
		{
			o=new OverRangeException();
		}
	}

}
