class HelloWorld{
	public static void main(String[]args){
	String month="march";
	if(month=="january"||month=="march"||month=="may"||month=="july"||month=="august"||month=="october"||month=="december")
	System.out.println("31 days");
	else if(month=="april"||month=="june"||month=="september"||month=="november")
	System.out.println("30 days");
	else if(month=="february")
	System.out.println("28 days");
	else
	System.out.println("enter the month correctly");
}
}