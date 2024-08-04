package module1;

public class Array1{
	public static void main(String[]args)
	{
	
	 int a[]=new int[]{10,20,30,40,50,60,70,80};
	 
	 
	 if(a.length%2==0)
	 {
		 int b[]=new int[a.length/2];
		 int c[]=new int[a.length/2];
	 }
	 for(int x=0;x<=a.length-1;x++)
	 {
		if(a[x]%2==0)
		{	
			for(int y=0;y<=c.length-1;y++)
				c[y]=a[x];
		}
		else
		{	for(int z=0;z<=b.length-1;z++)
				 b[z]=a[x];
		}
	}
	for(int t:b)
		System.out.print(t+" ");
	System.out.println();
	for(int t:c)
		System.out.print(t+" ");
	}
}