
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws Exception {
	
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

int y,m;
y=Integer.parseInt(br.readLine());
m=Integer.parseInt(br.readLine());

UserMainCode.displayDay(y,m);
	}

} 
