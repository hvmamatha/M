import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
	  int min=9;
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
		if(a[x]<min)
			min=a[x];
	  }
	  System.out.println("minimum element of the array is :"+min);
	}
}