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
	int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
	for(int x=0;x<a.length;x++)
	{
		if(min>a[x])
		{
			smin=min;
			min=a[x];
		}
		else if(smin>a[x] && min<a[x])
		{
			smin=a[x];
		}
	}
	System.out.println();
	System.out.println("min number is :"+min);
	System.out.println("second min is :"+smin);
	}
}

	
	