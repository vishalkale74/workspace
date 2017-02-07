class DeliveryBO
{
	DeliveryBO()
	{
		//empty
	}
	
	void displayAllDeliveryDetails(Delivery[] deliveryList)
	{
		System.out.println("Delivery Details");
		Object[] a={"Over","Ball","Runs","Batsman","Bowler","NonStriker"};
		System.out.println(""+String.format("%-20s %-20s %-20s %-20s %-20s %s",a));
		for (int i = 0; i < deliveryList.length; i++) {
			System.out.println(""+deliveryList[i].toString());
		}
	}
	void displayBatsmanBowlerDetails(Delivery[] deliveryList, long ball,long over)
	{
		for (int i = 0; i < deliveryList.length; i++) {
			if (deliveryList[i].getBall()==ball && deliveryList[i].getOver()==over) {
				System.out.println("Batsman : "+deliveryList[i].getBatsman());
				System.out.println("Bowler : "+deliveryList[i].getBowler());
			}
			
		}
	}
	
	void displayMaximumRunDetails(Delivery[] deliveryList)
	{
		long max=0,over=0,ball=0;
		for (int i = 0; i < deliveryList.length; i++) {
			if(deliveryList[i].getRuns()>max)
			{
				max=deliveryList[i].getRuns();
				over=deliveryList[i].getOver();
				ball=deliveryList[i].getBall();
			}
		}
		System.out.println("Maximum Runs : "+max);
		System.out.println("Over : "+over);
		System.out.println("Ball : "+ball);
	}

}
