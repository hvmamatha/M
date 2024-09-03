import java.util.Scanner;
class ArraySum
{
	public static void main(String[]args)
	{
	 
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of the array");
	 int size=s.nextInt();
	 int a[]=new int[size];
	 int b[]=new int[a.length];
	 System.out.println("enter "+a.length+" elements");
	 for(int x=0;x<a.length;x++)
	 {
		a[x]=s.nextInt();
	 }
	 for(int x=0;x<a.length;x++)
	 {
		if(x==0) 
		{
		    b[x]=a[x] + a[x+1];
		}
		else if(x==a.length-1)
		{
		    b[x]=a[x] + a[x-1];
		}
		else
		{
		   b[x]=a[x-1] + a[x+1];
		}	
	
	}
	System.out.println();
	System.out.println("elements of the b array is ");
	for(int x=0;x<b.length;x++)
	{
		System.out.println(b[x]);
	}

	}	
	
}
	 
	 
	 