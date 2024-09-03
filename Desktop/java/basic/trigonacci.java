class Ch20
{
	public static void main(String[]args)
	{
	int a=1,b=2,c=5,d,start=0,end=10;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	while(start<=end)
	{
		d=a+b+c;
		a=b;
		b=c;
		c=d;
		System.out.println(d);
		start++;
	}
	
	
	}
}