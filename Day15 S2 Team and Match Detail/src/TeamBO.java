
class TeamBO
{

  
 public Team createTeam(String data, Player[] playerList)
 {
	 Team t=null;
	 String arr[]=data.split(",");
	 for(int i=0;i<playerList.length;i++){
		 if(arr[1].equals(playerList[i].getName())){
			 t=new Team(arr[0],playerList[i]);
		 }
	 }
	 return t;
    //fill your code
 }
 


}
