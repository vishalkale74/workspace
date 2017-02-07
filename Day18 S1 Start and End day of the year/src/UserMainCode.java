import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class UserMainCode {
                
                public static void displayDay(int year) throws Exception {
                                
                                
                                String s=""+year+"";
                                SimpleDateFormat sd= new SimpleDateFormat("yyyy");
                                Date dt= sd.parse(s);
                                
                                
                                Calendar cal= new GregorianCalendar();
                                cal.setTime(dt);
                                Date firstDayOfYear = cal.getTime();  
                                SimpleDateFormat sdf = new SimpleDateFormat("EEE");   
                    System.out.println("Start Day of the given year is "+sdf.format(firstDayOfYear));
                    
                    
                    
                    Calendar cal1= new GregorianCalendar();
                                cal1.setTime(dt);
                                cal1.set(Calendar.DAY_OF_YEAR, cal1.getActualMaximum(Calendar.DAY_OF_YEAR));  
                                 Date lastDayOfMonth =cal1.getTime();
                                SimpleDateFormat sdf1 = new SimpleDateFormat("EEE");   
                    System.out.println("End Day of the given year is "+sdf1.format(lastDayOfMonth));
                    
                     
                                
                                
                }

}

