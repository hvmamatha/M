import java.util.Scanner;
class Prime
{
	public static void main(String[]args)
	{
	
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of the array");
	 int size=s.nextInt();
	 int a[]=new int[size];
	 System.out.println("enter "+a.length+" elements");
	 for(int x=0;x<=a.length-1;x++)
	 {
		a[x]=s.nextInt();
	 }
	 for(int x=0;x<a.length;x++)
	 {
		int count=0;
		
		for(int y=1;y<=a[x];y++)
		{
			if(a[x]%y==0)
				count++;
		}
		if(count==2)
			System.out.println("prime numbers are :"+a[x]);
	 }
	
	}
}
