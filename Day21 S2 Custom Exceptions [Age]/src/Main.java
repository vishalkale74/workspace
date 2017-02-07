import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

       static void validate(int age)throws CustomException{  
            if(age<19)  
             throw new CustomException("InvalidAgeRangeException");  
              
          }  
            
          public static void main(String args[]){  
             try{  
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter the player name");
             String name= br.readLine();
             System.out.println("Enter the player age");
            int age=Integer.parseInt(br.readLine());
            validate(age);
            System.out.println("Player name : "+name+"\nPlayer age : "+age);
             
             }catch(Exception m){System.out.println(m);}
              

       }

}
