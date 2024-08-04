import java.util.Random;
class Sort
{
	public static void main(String[]args)
	{
	Random r=new Random();
	int a[]=new int[5];
	for(int x=0;x<a.length;x++)
		a[x]=r.nextInt(1,100);
	System.out.println("before sorting");
	for(int t:a)
		System.out.print(t+" ");
	for(int x=0;x<=a.length;x++)
	{
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]>a[y])//a[x]<b[y] for descending order
			{
				int t=a[x];
				a[x]=a[y];
				a[y]=t;
			}
		}
	}
	System.out.println();
	System.out.println("after sorting");
	for(int t:a)
		System.out.print(t+" ");
	}
}
