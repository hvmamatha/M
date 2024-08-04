class Array
{
	public static void main(String[]args)
	{
	int a[]=new int[]{10,9,2,5,1,6,3};
	
	for(int x=0;x<=a.length-2;x++)
	{
		if(a[x]>a[x+1])
		{
			int t=a[x];
			a[x]=a[x+1];
			a[x+1]=t;
			x=x-1;
		}
	}
	for(int y:a)
		System.out.println(y);
	
	
}
}