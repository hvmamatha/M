class Ch20
{
	public static void main(String[]args)
	{
	int start=1,num=8,sum=0,pro=1;
	while(start<=num)
	{
		if(num%start==0)
		{
			if(start%2==0)
			{
				System.out.println(start+" is even factor of "+num);
				sum+=start;
			}
			else 
			{
				System.out.println(start+" is odd factor of "+num);
				pro*=start;
			}
			
		}
		
		start++;
	}
	System.out.println("sum of even factors of "+num +" is "+sum );
	System.out.println("product of odd factors of "+num +" is "+pro );
	
	}
}