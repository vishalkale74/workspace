class OutcomeBO
{
OutcomeBO(){}
void displayAllOutcomeDetails(Outcome[] outcomeList) 
{
	System.out.println("Outcome Details");
	String[] a={"Status","Winning Team","Player Of The Match","Date"};
	System.out.println(""+String.format("%-20s %-20s %-20s %s",a));
	for (int i = 0; i < outcomeList.length; i++) {
		System.out.println(outcomeList[i].toString());
	}
}

void displaySpecificOutcomeDetails(Outcome[] outcomeList, String date)
{
	System.out.println("Outcome Details");
	String[] a={"Status","Winning Team","Player Of The Match","Date"};
	System.out.println(""+String.format("%-20s %-20s %-20s %s",a));
	for (int i = 0; i < outcomeList.length; i++) 
	{
		if (outcomeList[i].getDate().equals(date)) 
		{
			System.out.println(outcomeList[i].toString());
		}
	}

}

}
