import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class InningsBO {
	 
   public  Innings createInnings(String data) {
	
   String[] x= data.split(",");
   Innings ing= new Innings(Long.parseLong(x[0]), x[1]);
   return ing;
    }

}
