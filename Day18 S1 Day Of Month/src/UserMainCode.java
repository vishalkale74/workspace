import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
                
                public static void displayDay(int year,int month) throws Exception {
                                
                                String s=""+year+"/"+month;
                                SimpleDateFormat sd= new SimpleDateFormat("yyyy/MM");
                                Date dt= sd.parse(s);
                                
                                
                                Calendar cal= new GregorianCalendar();
                                cal.setTime(dt);
                                Date firstDayOfMonth = cal.getTime();  
                                SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEEE");   
                    System.out.println(sdf.format(firstDayOfMonth).toUpperCase());
                    
                    
                    
                    Calendar cal1= new GregorianCalendar();
                                cal1.setTime(dt);
                                cal1.set(Calendar.DAY_OF_MONTH, cal1.getActualMaximum(Calendar.DAY_OF_MONTH));  
                                 Date lastDayOfMonth =cal1.getTime();
                                SimpleDateFormat sdf1 = new SimpleDateFormat("EEEEEEEE");   
                    System.out.println(sdf1.format(lastDayOfMonth).toUpperCase());
                    
                     
                                
                                
                }

}

