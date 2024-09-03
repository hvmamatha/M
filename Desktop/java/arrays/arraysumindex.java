import java.util.Scanner;
class ArraySum
{
	public static void main(String[]args)
	{
	 
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of the array");
	 int size=s.nextInt();
	 int a[]=new int[size];
	 int sum1=0,sum2=0;
	 System.out.println("enter "+a.length+" elements");
	 for(int x=0;x<a.length;x++)
	 {
		a[x]=s.nextInt();
		if(x%2==0)
			sum1=sum1+a[x];
		else
			sum2=sum2+a[x];
	}
	System.out.println("sum of even index is "+sum1);
	System.out.println("sum of odd index is "+sum2);
	}
}
