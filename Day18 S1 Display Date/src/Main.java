import java.text.ParseException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		UserMainCode.displayDate(date);
		sc.close();
	}

}
