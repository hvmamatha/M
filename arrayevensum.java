import java.util.Scanner;
class ArraySum
{
	public static void main(String[]args)
	{
	 int sum_even=0,sum_odd=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of the array");
	 int size=s.nextInt();
	 int a[]=new int[size];
	 System.out.println("enter "+a.length+" elements");
	 for(int x=0;x<=a.length-1;x++)
	 {
		a[x]=s.nextInt();
		if(a[x]%2==0)
			sum_even=sum_even+a[x];
		else
			sum_odd=sum_odd+a[x];
	 }
	 System.out.println("sum of the even elements of the array is "+sum_even);
	 System.out.println("sum of the odd elements of the array is "+sum_odd);
	}
}
	 
	 
	 