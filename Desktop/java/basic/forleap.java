class Ch20
{
	public static void main(String[]args)
	{
	int start=1900,end=2024,count=0;
	for(;start<=end;start++)
	{
		if(start%4==0 && start%100!=0 || start%400==0)
		{	System.out.println(start+" is leap year ");
			count++;
		}
		else
			System.out.println(start+" is not a leap year ");

		
	}
	
	}
}