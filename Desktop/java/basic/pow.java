class Ch20
{
	public static void main(String[]args)
	{
		int a=2,n=8,start=1,mul=1;
		if(start==0)
			mul=1;
		else
		{
			while(start<=n)
			{
				mul=mul*a;
				start++;
		
			}
		}
	System.out.println(mul);
	}
}