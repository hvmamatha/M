class Ch20
{
	public static void main(String[]args)
	{
	int num1=12,num2=15,start=1,count=0,hcf=0;
	if(num1<num2)
	{
		System.out.println("num1 is smaller");
		while(start<=num1)
		{
		if(num1%start==0 && num2%start==0)
		{
			
			System.out.println(start+ " is common factor of "+num1+ " and "+num2);
			count++;
			hcf=start;
		}
		start++ ;
		}
	}
	else
	{
		System.out.println("num2 is smaller");
		while(start<=num2)
		{
		if(num1%start==0 && num2%start==0)
		{
			
			System.out.println(start+ " is common factor of "+num1+ " and "+num2);
			count++;
			hcf=start;
		}
		start++ ;
		}
	}
	
	System.out.println("no.of common factors :"+count);
	System.out.println("highest common factor is :"+hcf);
	
	} 
}