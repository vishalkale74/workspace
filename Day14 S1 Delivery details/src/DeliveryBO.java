
public class DeliveryBO {

	void displayAllDeliveryDetails(Delivery[] deliveryList)
	{
		System.out.println("Delivery Details");
		for (int i = 0; i < deliveryList.length; i++) {
			System.out.println("Delivery--"+(i+1));
			System.out.println(deliveryList[i].toString());
		}

	}
}
