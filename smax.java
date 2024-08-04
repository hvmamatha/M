import java.util.Random;
class Max
{
	public static void main(String[]args)
	{
	Random r=new Random();
	int a[]=new int[5];
	for(int x=0;x<a.length;x++)
		a[x]=r.nextInt(1,100);
	for(int t:a)
		System.out.print(t+" ");
	int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
	for(int x=0;x<a.length;x++)
	{
		if(max<a[x])
		{
			smax=max;
			max=a[x];
		}
		else if(smax<a[x] && max>a[x])
		{
			smax=a[x];
		}
	}
	System.out.println();
	System.out.println("max number is :"+max);
	System.out.println("second max is :"+smax);
	}
}

	
	