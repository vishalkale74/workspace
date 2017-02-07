import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class DeliveryBO
{
  
     public Delivery createDelivery(String data,Innings[] inningsList) {
      
           String[] data1= data.split(",");
           Innings ing=new Innings();
           for(int i=0;i<inningsList.length;i++)
           {
        	   if(inningsList[i].getInningsNumber()==Long.parseLong(data1[4]))
        	   {
        		   ing=inningsList[i];
        	   }
           }
           Delivery del= new Delivery(Long.parseLong(data1[0]), data1[1], data1[2], Long.parseLong(data1[3]),ing);
           return del;
 
      }


 public long findInningsNumber(Delivery [] deliveryList, long deliveryNumber)

  {
	 long ingno=0;

 for(int i=0;i<deliveryList.length;i++)
 {
	 if(deliveryList[i].getDeliveryNumber()==deliveryNumber)
	 {
		ingno= deliveryList[i].getInnings().getInningsNumber();
	 }
 }
 return ingno;

 }
}
