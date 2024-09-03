class Ch20
{
	public static void main(String[]args)
	{
	int num1=12,num2=15,start=1,lcf=0;
	if(num1<num2)
	{
		System.out.println("num1 is smaller");
		while(start<=num1)
		{
		if(num1%start==0 && num2%start==0)
		{
			lcf=start;
			break;
			
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
			lcf=start;
			break;
			
		}
		start++ ;
		}
	}
	
	System.out.println("lcf of"+num1+"&"+num2+" is :"+lcf);
	} 
}