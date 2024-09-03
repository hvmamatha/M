class Ch20
{
	public static void main(String[]args)
	{
	int a=1,b=2,c,start=0,end=10;
	System.out.println(a);
	System.out.println(b);
	while(start<=end)
	{
		c=a+b;//c=0+1=1
		b=a;//b=0
		a=c;//a=1
		System.out.println(c);
		start++;
	}
	
	
	}
}