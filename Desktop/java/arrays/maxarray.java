import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
	  int max=0;
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the array size");
	  int size=s.nextInt();
	  int a[]=new int[size];
	  System.out.println("enter "+a.length+" elements");
	  for(int x=0;x<=a.length-1;x++)
	  {
		a[x]=s.nextInt();
	  }
	  System.out.println();
	  for(int x=0;x<=a.length-1;x++)
	  {
		if(a[x]>max)
			max=a[x];
	  }
	  System.out.println("maximum element of the array is :"+max);
	}
}