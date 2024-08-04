class Selection
{
	public static void main(String[]args)
	{
	  int a[]=new int[]{10,30,11,23,45};
	  int min=0;
	  for(int x=0;x<=a.length-1;x++)
	  {
		min=x;
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[min]>a[y])
			{
				min=y;
			}
		}
		int t=a[x];
		a[x]=a[min];
		a[min]=t;
	  }
	  for(int t:a)
		System.out.println(t+"");
	}
}