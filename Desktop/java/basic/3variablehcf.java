class Ch20
{
	public static void main(String[]args)
	{
	int a=15,b=12,c=36,min=0,start=1,end=min,hcf=0,count=0;
	if(a<b)
		min=a;
	else if(b<c)
		min=b;
	else if(a<c)
		min=a;
	System.out.println(min);
	while(start<=min)
	{
		if(a%start==0 && b%start==0 &&c%start==0)
		{
			
			System.out.println(start+ " is common factor of "+a+ " and "+b+"and"+c);
			count++;
			hcf=start;
		}
		start++ ;
	}
		
	System.out.println("no.of common factors :"+count);
	System.out.println("highest common factor is :"+hcf);
	}
}
	

	