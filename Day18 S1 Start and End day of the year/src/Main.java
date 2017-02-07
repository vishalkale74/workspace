
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws Exception {
	
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the year");
int y;
y=Integer.parseInt(br.readLine());

UserMainCode.displayDay(y);
	}

} 
