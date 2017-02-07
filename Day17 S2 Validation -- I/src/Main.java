import java.text.*;
import java.time.temporal.ValueRange;
import java.util.Date;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();

		if(UserMainCode.validateDate(s))
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
	}

}
