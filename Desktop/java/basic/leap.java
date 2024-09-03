class HelloWorld{
	public static void main(String[]args){
	String month="february";
	if(month=="january"||month=="march"||month=="may"||month=="july"||month=="august"||month=="october"||month=="december")
	System.out.println("31 days");
	else if(month=="april"||month=="june"||month=="september"||month=="november")
	System.out.println("30 days");
	else if(month=="february")
	{
		
		System.out.println("28 days");
		int february=28;
		
		if(february==29)
		System.out.println("leap year");
		else
		System.out.println("not a leap year");
	}
	else
	System.out.println("enter the month correctly");
}
}