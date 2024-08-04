import java.util.Scanner;
class ArraySum
{
	public static void main(String[]args)
	{
	 int sum=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of the array");
	 int size=s.nextInt();
	 int a[]=new int[size];
	 System.out.println("enter "+a.length+" elements");
	 for(int x=0;x<=a.length-1;x++)
	 {
		a[x]=s.nextInt();
		sum=sum+a[x];
	 }
	 System.out.println("sum of the elements of the array is "+sum);
	}
}
	 
	 
	 