class Array{
	public static void main(String[]args)
	{
	 int a[]=new int[]{10,20,30,40,50,60,70,80,90};
	 if(a.length%2==0)
	 {
		int b[]=new int[a.length/2];
		int c[]=new int[a.length/2];	
	 }
	 else
	 {
		int b[]=new int[(a.length/2)+1];
		int c[]=new int[a.length/2];
			
	 }
	 for(int x=0;x<=a.length-1;x++)
	 {
		if(x%2==0)
		{
			for(int y=0;y<=b.length-1;y++)
				b[y]=a[x];
			
		}
		else
		{
			for(int z=0;z<=c.length-1;z++)
				c[z]=a[x];
			
		}
	}
	for(int i=0;i<=b.length-1;i++)
		System.out.print(b[i]);
	System.out.println();
	for(int i=0;i<=c.length-1;i++)
		System.out.print(c[i]);	
	}
}