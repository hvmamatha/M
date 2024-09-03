import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
	 int even=0,odd=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of the array");
	 int size=s.nextInt();
	 int a[]=new int[size];
	 System.out.println("enter "+a.length+" elements");
	 for(int i=0;i<=a.length-1;i++)
	 {
		a[i]=s.nextInt();
		
	 }
	 for(int i=0;i<a.length;i++)
	 {
		
		if(a[i]%2==0)
			even++;
		else
			odd++;
	}
	System.out.println("no.of even numbers are :"+even);
	System.out.println("no.of odd numbers are :"+odd);
	int b[]=new int[even];
	int c[]=new int[odd];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{     
			for(int x=0;x<b.length;x++)
			{
				b[x]=a[i];
				
			}
			
		}
		else
		{
			for(int y=0;y<c.length;y++)
			{
				c[y]=a[i];
				
			}
			
		}
	}
	
	}	