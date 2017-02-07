
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

                /**
                * @param args
                * @throws IOException 
                 */
                public static void main(String[] args) throws IOException {
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                
                                boolean isValid = false;
                                System.out.println("Enter the team name");
                                String name = br.readLine();
                                System.out.println("Enter the number of players suggested");
                                int n = Integer.parseInt(br.readLine());
                                
                                int playerId[] = new int[n];
                                String playerName[] = new String[n];
                                
                                for (int i = 0; i < n; i++) 
                                {
                                                System.out.println("Enter player "+(i+1)+" details");
                                                playerId[i]=Integer.parseInt(br.readLine());
                                                playerName[i]=br.readLine();
                                }
                                 
                                for (int i = 0; i < n; i++) 
                                {
                                                for (int j = i+1 ; j < n; j++)
                                                {
                                                                if(playerId[i]==playerId[j])
                                                                {
                                                                                isValid = true;
                                                                }
                                                }
                                }
                                if(isValid==false)
                                {
                                                for (int i = 0; i < n; i++) 
                                                {
                                                                System.out.println(playerId[i]+" "+playerName[i]);
                                                }
                                }
                                else
                                {
                                                try {
                                                                throw new DuplicateIdException("Player Id must be unique");
                                                } catch (DuplicateIdException e) {
                                                                
                                                                System.out.println("DuplicateIdException: "+e.getMessage());
                                                }
                                }
                                

                }

} 