import java.util.Scanner;
class ArraySum
{
	public static void main(String[]args)
	{
	 
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of the array");
	 int size=s.nextInt();
	 int a[]=new int[size];
	 System.out.println("enter "+a.length +" elements:");
	 int k=5;
	 for(int x=0;x<=a.length-1;x++)
	 {
		a[x]=s.nextInt();
	 }
	 for(int x=0;x<=a.length-1;x++)
	 {
		for(int y=x;y<a.length;y++)
		{
			if(a[x]+a[y]==k)
			{
			 System.out.println(a[x]+" "+a[y]);
			}
		}
	 }

	}
}
